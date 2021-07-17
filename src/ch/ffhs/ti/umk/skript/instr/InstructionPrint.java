package ch.ffhs.ti.umk.skript.instr;

public class InstructionPrint extends Instruction {

    public final Instruction statement;

    public InstructionPrint(Instruction statement) {
        this.statement = statement;
    }

    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitPrintInstruction(this);
    }
}
