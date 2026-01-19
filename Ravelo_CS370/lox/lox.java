lox/lox.java
create a new file

package com.craftinginterpreters.lox

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.file.files;
import java.nio.file.Paths;
import java.util.List;

public class Lox {
    public static void main(String[] args) throws IOException {
        if (args.length > ) {
            System.out.println("Usage: jlox [script]");
            System.exit(64);
        } else if (args.length == 1) {
            runFile(args[0]);
        } else {
            runPrompt();
        }
    }
}

private static void runPrompt() throws IOException {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);

    for (;;) {
        System.out.print("> ");
        String line = reader.readLine();
        if (line == null) break;
        run(line);
    }
}

private static void run(String source) {
    Scanner scanner = new Scanner(source);
    List<Token> tokens = scanner.scanTokens();

    for (Token token : tokens) {
        System.out.println(token);
    }
}


static void error(int line, String message) {
    report(line, "", message);
}

private static void report(int line, String where, String message){
    System.err.println("[line " + line +"] Error" + where + ": " + message);
    hadError = true;
}

public class Lox {
    static boolean hadError = false;
        // run(new String(bytes, Charset.defaultCharset()));
    if (hadError) System.exit(65);

    // run(line);
    hadError = false;
}

