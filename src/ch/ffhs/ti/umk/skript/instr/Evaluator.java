package ch.ffhs.ti.umk.skript.instr;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Ein Evaluator zum Auswerten von Instructions.
 * Die Klasse ist eine Visitorklasse und wird wie folgt verwendet:
 * instruction.acceptVisitor(evaluator);
 *
 * @author urs-martin
 */
public class Evaluator implements InstructionVisitor<Object> {
    /**
     * Eine Map mit Namen-Wert Paaren für Variable
     */
    private Map<String, Object> context;

    /**
     * Erzeugt einen Evaluator mit leerem Context und leerer FunktionsLibrary.
     */
    public Evaluator() {
        this(new HashMap<String, Object>());
    }

    /**
     * Erzeugt einen Evaluator
     *
     * @param context Vordefinierte Variablenwerte
     */
    public Evaluator(Map<String, Object> context) {
        this.context = context;
    }

    // Ohne weitere Kommentare: Auswertungsmethoden für alle Instruktionstypen.

    @Override
    public Object visitConstant(
            InstructionConstant instructionConstant) {
        return instructionConstant.value;
    }

    @Override
    public Object visitGetVariable(
            InstructionGetVariable instructionGetVariable) {
        if (context.containsKey(instructionGetVariable.name)) {
            return context.get(instructionGetVariable.name);
        } else {
            throw new RuntimeException("Variable " + instructionGetVariable.name + " not initialized.");
            //TODO spezifischere Exception
        }
    }

    @Override
    public BigInteger visitSetVariable(
            InstructionSetVariable instructionSetVariable) {
        Object evaluatedValue = instructionSetVariable.value.acceptVisitor(this);
        context.put(instructionSetVariable.name, evaluatedValue);
        return null;
    }

    @Override
    public Object visitIfStatement(InstructionIfStatement instructionIfStatement) {
        Boolean conditionalStatement = (Boolean) instructionIfStatement.conditionExpression.acceptVisitor(this);
        if (conditionalStatement) {
            return instructionIfStatement.ifStatement.acceptVisitor(this);
        }
        return null;
    }

    @Override
    public Object visitConditionalStatement(InstructionConditionalStatement instructionConditionalStatement) {
        return evaluateTrueOrFalse(instructionConditionalStatement);
    }

    /**
     * * @param instructionConditionalStatement
     *
     * @return Autor: Daniel Schmitz
     * Hilfsmethode // TODO Sollte in eine eigene Klasse ausgelagert werden
     * Diese Methode evaluiert mithilfe der JS - Engine ob ein Statement wahr oder falsch sein sollte.
     * Es werden automatisiert Typkonvertierungen vorgenommen.
     */
    private Boolean evaluateTrueOrFalse(InstructionConditionalStatement instructionConditionalStatement) {
        Object left = instructionConditionalStatement.leftOperand.acceptVisitor(this);
        Object right = null;
        Object comparison = null;
        if (instructionConditionalStatement.rightOperand != null) {
            right = instructionConditionalStatement.rightOperand.acceptVisitor(this);
        }
        if (instructionConditionalStatement.comparisonSymbol != null) {
            comparison = instructionConditionalStatement.comparisonSymbol.acceptVisitor(this);
        }
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            if (left != null && right != null && comparison != null) {
                return (Boolean) engine.eval(left + " " + comparison + " " + right);
            } else {
                return (Boolean) engine.eval(left.toString());
            }
        } catch (ScriptException e) {
            return false;
        }
    }

    /**
     * @param instructionIfElseStatement
     * @return Author: Daniel Schmitz
     * Evaluiert das If-Statement.
     * Sofern True, dann wird das IfStatement ausgeführt.
     * Sofern False, dann wird das Else Statement ausgeführt
     */
    @Override
    public Object visitIfElseStatement(InstructionIfElseStatement instructionIfElseStatement) {
        Boolean conditionalStatement = (Boolean) instructionIfElseStatement.conditionExpression.acceptVisitor(this);
        if (conditionalStatement) {
            return instructionIfElseStatement.ifStatement.acceptVisitor(this);
        } else {
            return instructionIfElseStatement.elseStatement.acceptVisitor(this);
        }
    }


    @Override
    public Object visitInstructionConstantComparisonOperator(InstructionConstantComparisonOperator instructionConstantComparisonOperator) {
        return instructionConstantComparisonOperator.comparisonOperator;
    }

    /**
     * @param instructionSwitchStatement
     * @return Autor: Daniel Schmitz
     * CaseManager beinhaltet alle Cases inkl. der Condition.
     * Mittels der JS - Engine wird evaluiert ob das Statement wahr ist. Beim ersten Statement wird die goToAdresse gepsiechert (dies ist das Statement, welches es auszuführen gibt)
     */
    @Override
    public Object visitSwitchStatement(InstructionSwitchStatement instructionSwitchStatement) {
        Object obj = instructionSwitchStatement.simpleTerm.acceptVisitor(this);
        Integer goToAddress = null;
        for (int i = instructionSwitchStatement.cases.rules.size() - 1; i >= 0; i--) {
            CaseStatement rule = instructionSwitchStatement.cases.rules.get(i);

            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            try {
                Boolean wasSuccessfull = (Boolean) engine.eval(obj + " " + rule.comparisonSymbol.acceptVisitor(this) + " " + rule.rightOperand.acceptVisitor(this));
                if (wasSuccessfull) {
                    goToAddress = i;
                    break;
                }
                ;
            } catch (ScriptException e) {
            }
        }
        if (goToAddress == null) {
            return null;
        } else {
            return instructionSwitchStatement.cases.statements.get(goToAddress).acceptVisitor(this);
        }
    }

    /**
     * @param instructionWhileStatement
     * @return Autor: Daniel Schmitz
     * Führt die Statements innerhalb der Schlaufe aus, solange die ConditionExpression Truthy ist. Evaluierung erfolgt über JS - Engine
     */
    @Override
    public Object visitWhileStatement(InstructionWhileStatement instructionWhileStatement) {
        ArrayList<Instruction> instructions = instructionWhileStatement.whileManager.instructions;
        Object obj = null;
        while (this.evaluateTrueOrFalse(instructionWhileStatement.conditionExpression)) {
            for (int i = instructions.size() - 1; i >= 0; i--) {
                obj = instructions.get(i).acceptVisitor(this);
            }
        }
        return obj;
    }

    /**
     * @param instructionPrint
     * @return Autor: Daniel Schmitz
     * Einfache Hilfsfunktion.
     * Druck den Angegeben wert aus mit System.out.println
     */
    @Override
    public Object visitPrintInstruction(InstructionPrint instructionPrint) {
        Object val = instructionPrint.statement.acceptVisitor(this);
        System.out.println(val);
        return null;
    }

    /**
     * @param instructionGetArray
     * @return Autor: Daniel Schmitz
     * Erstellt ein generisches Array.
     */
    @Override
    public Object visitArrayBuilder(InstructionGetArray instructionGetArray) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i = instructionGetArray.arrayBuilder.arrayElements.size() - 1; i >= 0; i--) {
            arrayList.add(((InstructionConstant) instructionGetArray.arrayBuilder.arrayElements.get(i)).value);
        }
        return arrayList;
    }

    /**
     * @param instructionReassignment
     * @return Autor: Daniel Schmitz
     * Die Variable wird * / + / - ... dem angegeben Wert gerechnet der neue Wert wird wieder in
     * die HashMap gespeichert und die bestehende Variable wird sozusagen überschrieben.
     */
    @Override
    public Object visitInstructionReassignment(InstructionReassignment instructionReassignment) {
        String operator = String.valueOf(instructionReassignment.reassignmentOperator);
        String variableName = instructionReassignment.variableName;
        Object arithmeticResult = ((Instruction) instructionReassignment.arithmetic).acceptVisitor(this);

        Object val = this.context.get(variableName);

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            Object result = engine.eval(val + " " + operator + " " + arithmeticResult);
            this.context.put(variableName, result);
            return result;
        } catch (ScriptException e) {
            return false;
        }
    }


    @Override
    public BigDecimal visitBinaryOperation(InstructionBinaryOperation instructionBinOp) {
        BigDecimal left = (BigDecimal) instructionBinOp.leftOperand.acceptVisitor(this);
        BigDecimal right = (BigDecimal) instructionBinOp.rightOperand.acceptVisitor(this);
        switch (instructionBinOp.operator) {
            case PLUS:
                return left.add(right);
            case MINUS:
                return left.subtract(right);
            case TIMES:
                return left.multiply(right);
            case DIV:
                return left.setScale(10, RoundingMode.CEILING).divide(right, RoundingMode.CEILING);
            case MOD:
                return left.remainder(right);
            case POW:
                return left.pow(right.intValue()); //TODO overflow abfangen
            default:
                assert false;
                return null;
        }

    }

    @Override
    public BigInteger visitNegation(
            InstructionNegate instructionNegate) {
        BigInteger operand = (BigInteger) instructionNegate.operand.acceptVisitor(this);
        return operand.negate();
    }

    @Override
    public Object visitScript(InstructionScript instructionScript) {
        Object returnValue = null;
        for (Instruction instr : instructionScript.assignments) {
            returnValue = instr.acceptVisitor(this);
        }
        return returnValue;
    }


}
