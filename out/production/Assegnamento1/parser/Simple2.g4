grammar Simple2;

// THIS IS THE PARSER INPUT

block		: '{' statement* '}';

statement	: declaration
            | assignment ';'
			| deletion ';'
			| print ';'
			| ret ';'
			| ite
			| call ';'
			| block;


declaration : decFun
            | decVar ';';

decFun		: type ID args block;

args		: '(' (arg (',' arg)*)? ')';

arg         : type ref? ID;

ret			: 'return' (exp)?;

decVar      : type ID init;

init        : ('=' exp)?;

assignment	: ID '=' exp;

deletion	: 'delete' ID;

print		: 'print' exp;

ite         : 'if' condition block ('else' el)?;

el          : block
            | ite;

condition   : '(' exp ')';

call        : ID '(' (exp(',' exp)*)? ')';

type        : 'int'
            | 'bool'
            | 'void';

ref         : 'var';



exp			: '(' exp ')'							            #baseExp
			| '-' exp								            #negExp
			| '!' exp                                           #notExp
			| left=exp op=('*' | '/')               right=exp	#binExp
			| left=exp op=('+' | '-')               right=exp	#binExp
			| left=exp op=('<' | '<=' | '>' | '>=') right=exp   #binExp
			| left=exp op=('=='| '!=')              right=exp   #binExp
			| left=exp op='&&'                      right=exp   #binExp
			| left=exp op='||'                      right=exp   #binExp
			| call                                              #callExp
			| BOOL                                              #boolExp
			| ID 									            #varExp
		    | NUMBER							                #valExp;


// THIS IS THE LEXER INPUT

//Booleans
BOOL            : 'true'|'false';

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

