package main;

import ast.Simple2StmtBlock;
import ast.Simple2VisitorImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.BailSimple2Lexer;
import parser.Simple2Exception;
import parser.Simple2Parser;
import util_analysis.Environment;

import java.io.*;

public class Analyze {



        public static void main(String[] args) {
        String fileName = "test.spl";



        try{
            FileInputStream is = new FileInputStream(fileName);
            ANTLRInputStream input = new ANTLRInputStream(is);

            //create lexer
            //Simple2Lexer lexer = new Simple2Lexer(input);

            //create new lexer test 1
            parser.Simple2Lexer lexer = new BailSimple2Lexer(input);

            //create parser
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Simple2Parser parser = new Simple2Parser(tokens);


            //tell the parser to build the AST
            parser.setBuildParseTree(true);

            //build visitor
            Simple2VisitorImpl visitor = new Simple2VisitorImpl();

            //visit the tree from the root
            Simple2StmtBlock mainBlock = (Simple2StmtBlock) visitor.visitBlock(parser.block());

            //check esercizio 3
            mainBlock.checkSemantic(new Environment());
            System.out.println("True");




        } catch (IOException e) {
            e.printStackTrace();
        } catch (Simple2Exception le){
            System.err.println(le.getMessage());
        }

    }
}
