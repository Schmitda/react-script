package ch.ffhs.ti.umk.skript;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import ch.ffhs.ti.umk.skript.instr.SkriptInterpreter;
import java_cup.runtime.Symbol;
import ch.ffhs.ti.umk.skript.instr.Evaluator;
import ch.ffhs.ti.umk.skript.instr.Instruction;
import ch.ffhs.ti.umk.skript.instr.Validator;
import ch.ffhs.ti.umk.skript.parser.Parser;
import ch.ffhs.ti.umk.skript.parser.Scanner;

/**
 * Interaktiver Interpreter als Konsonen-Applikation.
 * Ein Skript-Teil wird jeweils nach Eingabe einer Leerzeile ausgeführt.
 *
 * @author urs-martin
 */
public class SkriptRunner {
    public static void main(String[] args) {
        SkriptInterpreter skriptInterpreter = new SkriptInterpreter();
        if (args.length > 0 && args[0] != null) {
            skriptInterpreter.runSkriptMode(args[0].split("=")[1]);
        } else {
            skriptInterpreter.runInteractiveMode();
        }
    }


}
