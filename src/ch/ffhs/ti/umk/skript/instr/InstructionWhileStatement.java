package ch.ffhs.ti.umk.skript.instr;

public class InstructionWhileStatement extends Instruction {

    public final InstructionConditionalStatement conditionExpression;
    public final WhileManager whileManager;

    public InstructionWhileStatement(Instruction conditionExpression, WhileManager whileManager) {
        this.whileManager = whileManager;
        this.conditionExpression = (InstructionConditionalStatement) conditionExpression;
    }

    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitWhileStatement(this);
    }
}
