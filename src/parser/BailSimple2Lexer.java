package parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

//import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

public class BailSimple2Lexer extends Simple2Lexer {
	public int count = 0;
    public List<String> listString;

    public BailSimple2Lexer(CharStream input) {
        super(input);
        this.listString=new LinkedList<String>();
    }

    @Override
    public void notifyListeners(LexerNoViableAltException e) {

        count = count + 1;
        String text = this._input.getText(Interval.of(this._tokenStartCharIndex, this._input.index()));
        String msg = "token recognition error at: '" + this.getErrorDisplay(text) + "'";
        String n_line = Integer.toString(this._tokenStartLine);
        String n_char_position = Integer.toString(this._tokenStartCharPositionInLine);
        listString.add("line " + n_line + ":" + n_char_position + " " + msg);

    }

    @Override
    public Token emitEOF() {
    	
        if(count>0){
            BufferedWriter writer = null;
            String msg=null;
            try {
                String errLog = "LexicalError.txt";
                File logFile = new File(errLog);
                msg ="Lexical error(s) found!. Error(s) list in:\n"+logFile.getCanonicalPath();
                writer = new BufferedWriter(new FileWriter(logFile));
                writer.write("Lexical error list: \n");
                for(String s:listString)
                    writer.write(s + "\n");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } finally {
                try {
                    writer.close();
                }catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
            throw new Simple2Exception(msg);
        }

        int cpos = this.getCharPositionInLine();
        int line = this.getLine();
        Token eof = this._factory.create(this._tokenFactorySourcePair, -1, (String)null, 0, this._input.index(), this._input.index() - 1, line, cpos);
        this.emit(eof);
        return eof;
    }
}
