// Generated from /home/chiarotti/NetBeansProjects/MiniPascal/grammar/minipascal/parser/MiniPascal.g4 by ANTLR 4.6

    package minipascal.parser;
    import minipascal.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#myStartingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyStartingRule(MiniPascalParser.MyStartingRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code progrm}
	 * labeled alternative in {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgrm(MiniPascalParser.ProgrmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockProgrm}
	 * labeled alternative in {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockProgrm(MiniPascalParser.BlockProgrmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockVar}
	 * labeled alternative in {@link MiniPascalParser#vardeclpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockVar(MiniPascalParser.BlockVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link MiniPascalParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleVar}
	 * labeled alternative in {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVar(MiniPascalParser.SimpleVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVarType}
	 * labeled alternative in {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVarType(MiniPascalParser.ArrayVarTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link MiniPascalParser#arraytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVar(MiniPascalParser.ArrayVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeIndexVar}
	 * labeled alternative in {@link MiniPascalParser#indexrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeIndexVar(MiniPascalParser.RangeIndexVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idVar}
	 * labeled alternative in {@link MiniPascalParser#simpletype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdVar(MiniPascalParser.IdVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procdeclpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcdeclpart(MiniPascalParser.ProcdeclpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#procdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcdecl(MiniPascalParser.ProcdeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt}
	 * labeled alternative in {@link MiniPascalParser#statementpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MiniPascalParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainStmt}
	 * labeled alternative in {@link MiniPascalParser#cmpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStmt(MiniPascalParser.MainStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smpStmt}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmpStmt(MiniPascalParser.SmpStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stcStmt}
	 * labeled alternative in {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStcStmt(MiniPascalParser.StcStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribStmt}
	 * labeled alternative in {@link MiniPascalParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribStmt(MiniPascalParser.AttribStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtID}
	 * labeled alternative in {@link MiniPascalParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtID(MiniPascalParser.StmtIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultReadStmt}
	 * labeled alternative in {@link MiniPascalParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultReadStmt(MiniPascalParser.ResultReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultWriteStmt}
	 * labeled alternative in {@link MiniPascalParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultWriteStmt(MiniPascalParser.ResultWriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAttrib}
	 * labeled alternative in {@link MiniPascalParser#assstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAttrib(MiniPascalParser.StmtAttribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idStmt}
	 * labeled alternative in {@link MiniPascalParser#procstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdStmt(MiniPascalParser.IdStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readStmt}
	 * labeled alternative in {@link MiniPascalParser#readstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(MiniPascalParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeStmt}
	 * labeled alternative in {@link MiniPascalParser#writestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(MiniPascalParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultSimpleExp}
	 * labeled alternative in {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultSimpleExp(MiniPascalParser.ResultSimpleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultExp}
	 * labeled alternative in {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultExp(MiniPascalParser.ResultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpression}
	 * labeled alternative in {@link MiniPascalParser#simpleexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpression(MiniPascalParser.TermExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(MiniPascalParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(MiniPascalParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(MiniPascalParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(MiniPascalParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MiniPascalParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(MiniPascalParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#multop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultop(MiniPascalParser.MultopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varID}
	 * labeled alternative in {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(MiniPascalParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexedVar}
	 * labeled alternative in {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedVar(MiniPascalParser.IndexedVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpStatement}
	 * labeled alternative in {@link MiniPascalParser#stcstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStatement(MiniPascalParser.CmpStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniPascalParser#stcstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniPascalParser#stcstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link MiniPascalParser#stcstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MiniPascalParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(MiniPascalParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MiniPascalParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(MiniPascalParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MiniPascalParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MiniPascalParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MiniPascalParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(MiniPascalParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#letdig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetdig(MiniPascalParser.LetdigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#specsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecsym(MiniPascalParser.SpecsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#predid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredid(MiniPascalParser.PredidContext ctx);
}