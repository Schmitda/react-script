package ch.ffhs.ti.umk.skript.instr;


public class InstructionConstantComparisonOperator extends Instruction {
    final Object comparisonOperator;
    final DataType dataType;


    public InstructionConstantComparisonOperator(Object value) {
        this.comparisonOperator = value;
        this.dataType = DataType.STRING;
    }

    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitInstructionConstantComparisonOperator(this);
    }
}
