package ch.ffhs.ti.umk.skript.instr;

import java.util.ArrayList;

public class CaseManager {
    public ArrayList<CaseStatement> rules = new ArrayList<CaseStatement>();
    public ArrayList<Instruction> statements = new ArrayList<Instruction>();

    public CaseManager() {

    }

    public void addCase(CaseStatement rule, Instruction statementToExecute) {
        this.rules.add(rule);
        this.statements.add(statementToExecute);
    }
}
