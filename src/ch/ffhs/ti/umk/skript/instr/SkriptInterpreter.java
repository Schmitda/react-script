package ch.ffhs.ti.umk.skript.instr;

import ch.ffhs.ti.umk.skript.parser.Parser;
import ch.ffhs.ti.umk.skript.parser.Scanner;
import java_cup.runtime.Symbol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkriptInterpreter {

    public void runInteractiveMode() {
        Map<String, Object> context = new HashMap<String, Object>();
        for (; ; ) {
            try {
                StringBuilder sb = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                for (; ; ) {
                    System.out.print("> ");
                    String line = br.readLine();
                    if (line.trim().length() == 0) break;
                    if (line.trim().lastIndexOf("\\") == line.trim().length() - 1) {
                        sb.append(line.replace("\\", ""));
                    } else {
                        sb.append(line);
                        sb.append("\n");
                    }
                }
                String script = sb.toString();
                if (script.trim().length() == 0) {
                    System.out.println("DONE");
                    return;
                }
                // String script = "switch 5 case > 5: 3 * 3 case > 6: 5 - 3";
                parse(script);
            } catch (Exception ex) {
                //System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    private void parse(String script) throws Exception {
        Map<String, Object> context = new HashMap<String, Object>();
        Parser parser = new Parser(new Scanner(new StringReader(script)));
        Symbol symbol = parser.parse();
        Instruction instr = (Instruction) symbol.value;
        Validator validator = new Validator();
        instr.acceptVisitor(validator);

        if (!validator.getUndefinedVariables().isEmpty()) {
            System.out.println("Error: Undefined variables: " +
                    setToString(validator.getUndefinedVariables()));
        } else {
            Evaluator evaluator = new Evaluator(context);
            Object result = instr.acceptVisitor(evaluator);
            if (result != null) {
                System.out.println("---> " + result);
            } else {
                System.out.println("---> ");
            }
        }
    }

    public void runSkriptMode(String scriptPath) {
        final ArrayList<String> script = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(scriptPath), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> {
                if (line.trim().length() - 1 == line.trim().lastIndexOf("\\")) {
                    script.add(line.replace("\\", ""));
                } else {
                    script.add(line + " \n");
                }
            });
            String result = script.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(""));
            this.parse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String setToString(Set<String> set) {
        return set.toString();
    }
}
