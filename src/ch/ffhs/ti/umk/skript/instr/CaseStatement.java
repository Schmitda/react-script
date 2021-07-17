package ch.ffhs.ti.umk.skript.instr;


public class CaseStatement {
    final Instruction comparisonSymbol;
    final Instruction rightOperand;

    public CaseStatement(Instruction symbol, Instruction rightOperand) {
        this.comparisonSymbol = symbol;
        this.rightOperand = rightOperand;
    }


}
