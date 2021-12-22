package com.craftinginterpreters.lox;

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }

    @Override
    public int hashCode() {
        return lexeme.hashCode();
    }
        
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Token tok = (Token) o;
        

        return type == tok.type 
          && (lexeme.equals(tok.lexeme)
          && (literal == null && tok.literal == null || literal.equals(tok.literal))
          && line == tok.line);
    }
}
