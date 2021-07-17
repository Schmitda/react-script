package ch.ffhs.ti.umk.skript.instr;

public class InstructionIfElseStatement extends Instruction {

    final Instruction conditionExpression;
    final Instruction ifStatement;
    final Instruction elseStatement;

    public InstructionIfElseStatement(Instruction conditionalStatement, Instruction ifStatement, Instruction elseStatement) {
        this.conditionExpression = conditionalStatement;
        this.ifStatement = ifStatement;
        this.elseStatement = elseStatement;
    }

    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitIfElseStatement(this);
    }
}
