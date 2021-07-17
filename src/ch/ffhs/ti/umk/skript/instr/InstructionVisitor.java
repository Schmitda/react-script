package ch.ffhs.ti.umk.skript.instr;


public interface InstructionVisitor<R> {
    public R visitScript(InstructionScript instructionScript);

    public R visitBinaryOperation(InstructionBinaryOperation instructionBinOperation);

    public R visitNegation(InstructionNegate instructionUnaryOperation);

    public R visitConstant(InstructionConstant instructionConstant);

    public R visitGetVariable(InstructionGetVariable instructionGetVariable);

    public R visitSetVariable(InstructionSetVariable instructionSetVariable);

    public R visitIfStatement(InstructionIfStatement instructionIfStatement);

    R visitConditionalStatement(InstructionConditionalStatement instructionConditionalStatement);

    R visitIfElseStatement(InstructionIfElseStatement instructionIfElseStatement);

    R visitInstructionConstantComparisonOperator(InstructionConstantComparisonOperator instructionConstantComparisonOperator);

    R visitSwitchStatement(InstructionSwitchStatement instructionSwitchStatement);

    R visitWhileStatement(InstructionWhileStatement instructionWhileStatement);

    R visitPrintInstruction(InstructionPrint instructionPrint);

    R visitArrayBuilder(InstructionGetArray instructionGetArray);

    R visitInstructionReassignment(InstructionReassignment instructionReassignment);
}
