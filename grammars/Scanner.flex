package ch.ffhs.ti.umk.skript.parser;

import static ch.ffhs.ti.umk.skript.parser.Terminals.*;
import java_cup.runtime.Symbol;

%%

%public
%apiprivate
%class Scanner
%cupsym Terminals
%cup
%unicode
%line
%column

%{

    private Symbol sym(int type)
    {
         return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symVal(int type)
    {
         return new Symbol(type, yyline, yycolumn, yytext());
    }
   
%}

OPT_SPACE = [ \t]+
BREAK     = [\n\r]+
COMMENT   = "//".*
%%

"if"        { return sym(IF); }
"else"      { return sym(ELSE); }
"else if"   { return sym(ELIF); }
"switch"    { return sym(SWITCH); }
"case"      { return sym(CASE_SYMBOL); }
"=>"        { return sym(FUNC_EXPRESSION); }
"while"     { return sym(WHILE); }
"end"       { return sym(END_WHILE); }


"true"  { return sym(TRUE); }
"false" { return sym(FALSE); }
"print" { return sym(PRINT); }


"["         { return symVal(ARR_START); }
"]"         { return symVal(ARR_END); }
">"         { return symVal(GREATER_THAN); }
"<"         { return symVal(LOWER_THAN); }
">="        { return symVal(GREATER_EQUAL); }
"<="        { return symVal(LOWER_EQUAL); }
"=="        { return symVal(EQUAL); }
"+"         { return symVal(PLUS); }
"-"         { return symVal(MINUS); }
","         { return sym(COMMA); }
"?"         { return sym(QUESTION); }
"*"         { return symVal(TIMES); }
":"         { return sym(DOUBLE_POINT); }
"/"         { return symVal(DIV); }
"%"         { return symVal(MOD); }
"**"        { return symVal(POW); }

":="        { return sym(ASSIGN); }
"("	        { return sym(LPAR); }
")"	        { return sym(RPAR); }

\"[^\"]*\" { return symVal(STRING); }
\'[^\"]*\' { return symVal(STRING); }


[0-9]+                   { return symVal(NUMBER); }
\-?[0-9]+\.[0-9]+        { return symVal(NUMBER); }
([:jletter:]|_)([:jletterdigit:]|_)*	{return symVal(NAME); }

{BREAK} { return sym(SEP); }
{OPT_SPACE}	{ }
{COMMENT}   { }
\/\* .* *\/ { }
\/\/.* \n   { }

.		{ throw new RuntimeException("Illegal Symbol '" + yytext() + '\''
             + " in line " + yyline + ", column" + yycolumn); } 






