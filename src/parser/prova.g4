grammar prova;

/*
prova : token+;
/*
token: ALPHA uno | BETA due;

uno: ALPHA uno | BETA due |  ;

due: ALPHA uno |   ;



/*
prova : CHARLIE* (ALPHA uno | BETA due) CHARLIE*;

uno : CHARLIE* BETA;

due : CHARLIE* ALPHA;

/*


/*
prova : uno
      | due
      | tre ;

uno   : ALPHA+ (due | tre |  );

due   : BETA+(tre |  );

tre   : CHARLIE+;


*/
prova : token+;

token : uno | due;

uno   : ALPHA+ (due |  );

due   : BETA (uno |  );



ALPHA : ('a') ;
BETA  : ('b') ;
CHARLIE : ('c');





//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMMENTS)* '*/' -> skip;