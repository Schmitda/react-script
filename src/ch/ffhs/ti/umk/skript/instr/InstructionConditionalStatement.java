package ch.ffhs.ti.umk.skript.instr;


public class InstructionConditionalStatement extends Instruction {
    final Instruction leftOperand;
    final Instruction comparisonSymbol;
    final Instruction rightOperand;

    public InstructionConditionalStatement(Instruction symbol, Instruction leftOperand, Instruction rightOperand) {
        this.comparisonSymbol = symbol;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public InstructionConditionalStatement(Instruction operand) {
        this.leftOperand = operand;
        this.comparisonSymbol = null;
        this.rightOperand = null;
    }

    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitConditionalStatement(this);
    }
}
