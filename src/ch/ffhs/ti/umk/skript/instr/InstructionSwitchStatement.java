package ch.ffhs.ti.umk.skript.instr;

public class InstructionSwitchStatement extends Instruction {

    final CaseManager cases;
    final Instruction simpleTerm;

    public InstructionSwitchStatement(Instruction simpleTerm, CaseManager cases) {
        this.simpleTerm = simpleTerm;
        this.cases = cases;
    }

    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitSwitchStatement(this);
    }
}
