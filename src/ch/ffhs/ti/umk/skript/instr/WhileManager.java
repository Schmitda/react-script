package ch.ffhs.ti.umk.skript.instr;

import java.util.ArrayList;

public class WhileManager {
    public ArrayList<Instruction> instructions = new ArrayList<Instruction>();

    public  void addStatement(Instruction statement) {
        this.instructions.add(statement);
    }
}
