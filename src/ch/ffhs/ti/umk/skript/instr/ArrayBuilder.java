package ch.ffhs.ti.umk.skript.instr;

import java.util.ArrayList;

public class ArrayBuilder {

    ArrayList<Instruction> arrayElements = new ArrayList<Instruction>();

    public void addElementToArray(Instruction instructionGetVariable) {
        this.arrayElements.add(instructionGetVariable);
    }
}
