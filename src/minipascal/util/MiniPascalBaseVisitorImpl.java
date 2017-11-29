/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipascal.util;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import minipascal.parser.MiniPascalBaseVisitor;
import minipascal.parser.MiniPascalParser;
import minipascal.parser.MiniPascalParser.AddopContext;
import minipascal.parser.MiniPascalParser.ExpressionContext;
import minipascal.parser.MiniPascalParser.MultopContext;
import minipascal.parser.MiniPascalParser.SimpleexpressionContext;
import minipascal.parser.MiniPascalParser.TermContext;
import minipascal.parser.MiniPascalParser.VariableContext;
import minipascal.util.SymbolsTable;
import org.antlr.v4.runtime.misc.ParseCancellationException;
/**
 *
 * @author chiarotti
 */


public class MiniPascalBaseVisitorImpl extends MiniPascalBaseVisitor<Object>{
    public Object visitResultExp(MiniPascalParser.ResultExpContext ctx) {
        Object firstExp = visit(ctx.simpleexpression(0));
        Object secondExp = visit(ctx.simpleexpression(1));
 
        String op = ctx.relationop.getText();
        if(op.equals("=")){
            try{
                if(Double.parseDouble(firstExp.toString()) == Double.parseDouble(secondExp.toString())){
                    return true;
                }
            }catch(NumberFormatException ex){
                if(firstExp.equals(secondExp)){
                    return true;
                }                
            }

        }else if(op.equals("<")){
            if(Double.parseDouble(firstExp.toString()) < Double.parseDouble(secondExp.toString())){
                return true;
            }
        }else if(op.equals(">")){
           if(Double.parseDouble(firstExp.toString()) > Double.parseDouble(secondExp.toString())){
                return true;
            }
        }else if(op.equals("<=")){
            if(Double.parseDouble(firstExp.toString()) <= Double.parseDouble(secondExp.toString())){
                return true;
            }
        }else if(op.equals(">=")){
            if(Double.parseDouble(firstExp.toString()) >= Double.parseDouble(secondExp.toString())){
                return true;
            }
        }else if(op.equals("<>")){
            try{
                if(Double.parseDouble(firstExp.toString()) != Double.parseDouble(secondExp.toString())){
                    return true;
                }
            }catch(NumberFormatException ex){
                 if(!firstExp.equals(secondExp)){
                    return true;
                }   
            }
        }
        return false;
    }
    public Object visitIfStmt(MiniPascalParser.IfStmtContext ctx) { 
        Boolean visit = (Boolean) visit(ctx.expression());
        if(visit){
            return visit(ctx.statement());
        }
        return null;
    }
    
    public Object visitIfElseStmt(MiniPascalParser.IfElseStmtContext ctx){
        Boolean visit = (Boolean) visit(ctx.expression());
        if(visit){
            return visit(ctx.b1);
        }else{
            return visit(ctx.b2);
        }
    }
    public Object visitReadStmt(MiniPascalParser.ReadStmtContext ctx) {
        Scanner s = new Scanner(System.in);
        for(VariableContext var : ctx.variable()){
            Object[] value = SymbolsTable.getInstance().getSymbol(var.getText());
            value[1] = s.nextLine();
        }
        return 0d;
    }
    public Object visitWriteStmt(MiniPascalParser.WriteStmtContext ctx){
                try{
                    for (ExpressionContext value : ctx.expression()){

                    String valor = visit(value).toString();
                    if(valor.startsWith("\"")){
                        valor = valor.subSequence(1, valor.length()-1).toString();
                    }
                    System.out.println(valor);
                    }
                }catch(NullPointerException ex){
                    throw new ParseCancellationException("Falha na Interpretação: Variável não declarada!");
                }
        return 0d;
    }
     public Object visitWhileStmt(MiniPascalParser.WhileStmtContext ctx) {
         Boolean visit = (Boolean) visit(ctx.expression());
         while(visit){
             visit = (Boolean) visit(ctx.expression());
             visit(ctx.b1);
         }
         return 0d;
     }
     
     public Object visitForStmt(MiniPascalParser.ForStmtContext ctx) {
          Boolean visit = (Boolean) visit(ctx.expression());        
          while(visit){
             visit = (Boolean) visit(ctx.expression());
             visit(ctx.counter);
             visit(ctx.b1);
         }
          return 0;
     }
     
    public Object visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx) {
        Double total = 0.0;
        if(ctx.term(0).getText().matches("[a-zA-Z][a-zA-Z0-9_]*(\\Q[\\E[0-9]+\\Q]\\E)?")){
            total = Double.parseDouble(visit(ctx.term(0)).toString());
        }else if(ctx.term(0).getText().startsWith("\"")){
            return ctx.term(0).getText();
        }else{
            total = Double.parseDouble(visit(ctx.term(0)).toString());
        }
        int pos = 1;
            for(AddopContext add : ctx.addop()){

                if(add.getText().equals("+")){
                        total += Double.parseDouble(ctx.term(pos).getText());
                }else if(add.getText().equals("-")){
                        total -= Double.parseDouble(ctx.term(pos).getText());
                }
                pos++;
            }
            return total;
    }
    
    public Object visitTermExpression(MiniPascalParser.TermExpressionContext ctx){
        if(ctx.factor(0).getText().matches("[a-zA-Z][a-zA-Z0-9_]*(\\Q[\\E[0-9]+\\Q]\\E)?")){ 
            Object test = visit(ctx.factor(0));
            return test;
        }else if(ctx.factor(0).getText().startsWith("\"")){
            return ctx.factor(0).getText();
        }else{
            double total = Double.parseDouble(ctx.factor(0).getText());
            int pos = 1;
            for(MultopContext add : ctx.multop()){
                if(add.getText().equals("*")){
                        total *= Double.parseDouble(ctx.factor(pos).getText());
                }else if(add.getText().equals("div")){
                        total /= Double.parseDouble(ctx.factor(pos).getText());
                }
                pos++;
            }
            return total;
        }
    }
    
    public Object visitVarExpr(MiniPascalParser.VarExprContext ctx) {
        return visit(ctx.variable());
    }
    
    public Object visitIndexedVar(MiniPascalParser.IndexedVarContext ctx) {   
        return SymbolsTable.getInstance().getSymbol(ctx.getText())[1];
    }
    
    public Object visitVarID(MiniPascalParser.VarIDContext ctx) {
        
        return SymbolsTable.getInstance().getSymbol(ctx.getText())[1];
    }

    
    public Object visitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx) {
        String type = ctx.type().getText();

        if(type.contains("array")){
            Object[] list = (Object[]) visit(ctx.type());
            for(VariableContext vars : ctx.variable()){
                int init = Integer.parseInt(list[0].toString());
                int end = Integer.parseInt(list[1].toString());
                for(int i = init; i<=end; i++){
                    Object[] varData = new Object[2];
                    varData[0] = list[2];
                    String varName = vars.getText()+"["+i+"]";
                    SymbolsTable.getInstance().addSymbol(varName, varData);
                }
            }
        }else{

            for(VariableContext vars : ctx.variable()){
                Object[] varData = new Object[2];
                varData[0] = type;
                String varName = vars.getText();
                SymbolsTable.getInstance().addSymbol(varName, varData);
            }
        }
        return 0d;
    }
    
    public Object[] visitArrayVarType(MiniPascalParser.ArrayVarTypeContext ctx) {
        return (Object[]) visit(ctx.arraytype());
    }
    
    public Object[] visitArrayVar(MiniPascalParser.ArrayVarContext ctx) { 
        Object[] list = new Object[3];
        Object[] rangeList = (Object[]) visit(ctx.indexrange());
        list[0] = rangeList[0];
        list[1] = rangeList[1];
        list[2] = ctx.simpletype().getText();
        return list;
    }
    
     public Object[] visitRangeIndexVar(MiniPascalParser.RangeIndexVarContext ctx) {
         return ctx.DIGIT().toArray();
     }
     

    public Object visitStmtAttrib(MiniPascalParser.StmtAttribContext ctx) {
            if(SymbolsTable.getInstance().getSymbol(ctx.variable().getText()) != null){
                Object value = visit(ctx.expression());
                if(value == null){
                    value = ctx.expression().getText();
                }
            
                Object[] var = SymbolsTable.getInstance().getSymbol(ctx.variable().getText()); 
                    if(var[0].equals("float")){
                        var[1] = Float.parseFloat(value.toString());
                    }else if(var[0].equals("integer")){    

                        var[1] = (int)Double.parseDouble(value.toString());
                    }else if(var[0].equals("boolean")){
                        if(value.toString().equals("true") || value.toString().equals("false")){
                            var[1] = value;
                        }else{
                            throw new ParseCancellationException("Falha na interpretação: Tipo incorreto!");
                        }
                    }else if(var[0].equals("string")){
                        if(value.toString().startsWith("\"")){
                            var[1] = value;
                        }else{
                            throw new ParseCancellationException("Falha na interpretação: Tipo incorreto!");
                        }
                    }

            }else{
                throw new ParseCancellationException("Falha na Interpretação: Variável não declarada!");
            }
          
    return 0;

    }
}