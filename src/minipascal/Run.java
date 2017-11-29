/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minipascal;

import minipascal.parser.MiniPascalLexer;
import minipascal.parser.MiniPascalParser;
import minipascal.util.MiniPascalBaseVisitorImpl;
import minipascal.util.SymbolsTable;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import minipascal.parser.MiniPascalBaseVisitor;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author wellington
 */
/*
public class Run {
*/
    /**
     * @param args the command line arguments
     */
   

    /**
     * @param args the command line arguments
     */
public class Run{
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.basic");
        MiniPascalLexer lexer = new MiniPascalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniPascalParser parser = new MiniPascalParser(tokens);

        ParseTree tree = parser.program();

        MiniPascalBaseVisitor eval = new MiniPascalBaseVisitorImpl();
        eval.visit(tree);
   
}
}
