package ch.ffhs.ti.umk.skript.instr;

public class InstructionIfStatement extends Instruction {

    final Instruction conditionExpression;
    final Instruction ifStatement;

    public InstructionIfStatement(Instruction conditionalStatement, Instruction ifStatement) {
        this.conditionExpression = conditionalStatement;
        this.ifStatement = ifStatement;
    }

    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitIfStatement(this);
    }
}
