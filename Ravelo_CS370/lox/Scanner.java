package com.craftinginterpreters.lox;

import java.util.
ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static com.craftinginterpreters.lox.TokenType.*; // belongs to the class

class Scanner {

    // private final List<Token> tokens = new ArrayList<>();
    private int start = 0;
    private int current = 0;
    private int line = 1;
    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    Scanner(String source) {
        this.source = source;
    }
    List<Token> scanTokens() {
        while (!isAtEnd()) {
            scanToken();
        }

        tokens.add(new Token(EOF, "", null, line));
        return tokens;
    }
    private boolean isAtEnd() {
        return current >= source.length();
    }
    private void scanToken() {
        char c = advance();
    }
switch (c) {
    case VALUE_1:
        // code block
        break;
    case VALUE_2:
        // code block
        break;
    }
}