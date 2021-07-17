package ch.ffhs.ti.umk.skript.instr;

public class InstructionGetArray extends Instruction {

    final ArrayBuilder arrayBuilder;

    public InstructionGetArray(ArrayBuilder arrayBuilder) {
        this.arrayBuilder = arrayBuilder;
    }

    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitArrayBuilder(this);
    }
}
