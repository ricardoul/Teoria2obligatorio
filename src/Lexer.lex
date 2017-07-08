package lang.parser;

import java_cup.runtime.Symbol;

%%

%class Lexer
%cupsym Tokens
%cup
%implements Tokens
%public
%{ 
	/* Embedded lexer class code */  
%}

%% 
// Tokens.

NULL {return new Symbol(NULL, yytext());}
[:] {return new Symbol(COLON, yytext());}
[(] {return new Symbol(L_BRACKET, yytext());}
[)] {return new Symbol(R_BRACKET, yytext());}
[,] {return new Symbol(COMMA, yytext());}
(TRUE|true)	{ return new Symbol(TRUE, true); }
(FALSE|false)	{ return new Symbol(FALSE, false); }
\"[^\"\n]*\" {return new Symbol(STRING, yytext());}
[+-]?([0-9]*[.])?[0-9]+([eE][+-]?[0-9]+)?	{ return new Symbol(DOUBLE, Double.parseDouble(yytext())); }
[a-zA-Z][a-zA-Z0-9\.]* {return new Symbol(TAG, yytext());}
\/\*([^\*])*\*\/ {/*ignorar*/}
.	{ /* Fallback */
		return new Symbol(error, "Unexpected input <"+ yytext() +">!"); 
	}