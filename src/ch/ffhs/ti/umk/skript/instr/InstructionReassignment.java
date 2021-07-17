package ch.ffhs.ti.umk.skript.instr;

public class InstructionReassignment extends Instruction {

    public final String variableName;
    public final Object reassignmentOperator;
    public final Object arithmetic;

    public InstructionReassignment(String variableName, Object arithmetic, Object reassignmentOperator) {
        this.variableName = variableName;
        this.reassignmentOperator = reassignmentOperator;
        this.arithmetic = arithmetic;
    }


    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitInstructionReassignment(this);
    }
}
