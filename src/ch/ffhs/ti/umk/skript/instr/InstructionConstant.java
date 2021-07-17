package ch.ffhs.ti.umk.skript.instr;

import java.math.BigDecimal;

public class InstructionConstant extends Instruction {
    final Object value;
    final DataType dataType;

    public static InstructionConstant asInt(String str) {
        return new InstructionConstant(new BigDecimal(str), DataType.INT);
    }

    public static InstructionConstant asFloat(String str) {
        return new InstructionConstant(new BigDecimal(str), DataType.FLOAT);
    }


    public static InstructionConstant asString(String str) {
        return new InstructionConstant(str, DataType.STRING);
    }

    public InstructionConstant(Object value, DataType dataType) {
        this.value = value;
        this.dataType = dataType;
    }

    public static InstructionConstant asBool(Boolean b) {
        return new InstructionConstant(b, DataType.BOOLEAN);
    }

    public <R> R acceptVisitor(InstructionVisitor<R> visitor) {
        return visitor.visitConstant(this);
    }
}
