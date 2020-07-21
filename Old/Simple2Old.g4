grammar Simple2;

// THIS IS THE PARSER INPUT

block		: '{' statement* '}';

statement	: declaration
            | assignment ';'
			| deletion ';'
			| print ';'
			| block;

declaration : decFun
            | decVar ';';

decFun		: type ID args '{' inside* '}';

inside       : statement
             | ret;

ret			: 'return' (exp)? ';' ;

args		: '(' (arg (',' arg)*)? ')';

arg			: type ID;

decVar      : type ID init;

init        : ('=' exp)?;

assignment	: ID '=' exp;

deletion	: 'delete' ID;

print		: 'print' exp;

type        : 'int'
            | 'bool'
            | 'void';


exp			: '(' exp ')'							            #baseExp
			| '-' exp								            #negExp
			| left=exp op=('*' | '/')               right=exp	#binExp
			| left=exp op=('+' | '-')               right=exp	#binExp
			| left=exp op=('<' | '<=' | '>' | '>=') right=exp   #binExp
			| left=exp op= '=='                     right=exp   #binExp
			| ID 									            #varExp
		    | NUMBER							                #valExp;


// THIS IS THE LEXER INPUT

//IDs
fragment CHAR 	: 'a'..'z' |'A'..'Z' ;
ID              : CHAR (CHAR | DIGIT)* ;

//Numbers
fragment DIGIT	: '0'..'9';
NUMBER          : DIGIT+;

//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMMENTS)* '*/' -> skip;