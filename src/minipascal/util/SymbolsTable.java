/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipascal.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wellington
 */
public class SymbolsTable {
    
    private HashMap<String, Object[]> symbols;
    
    protected SymbolsTable(){
        symbols = new HashMap<>();
    }
    
    private static SymbolsTable INSTANCE;
    
    public static SymbolsTable getInstance(){
        if (INSTANCE == null)
            INSTANCE = new SymbolsTable();
        return INSTANCE;
    }
    
    public void addSymbol(String symbol, Object[] value){
        symbols.put(symbol, value);
    }
    
    public Object[] getSymbol(String symbol){
        if(symbols.containsKey(symbol)){
         return symbols.get(symbol);
        }
        return null;
    }
    

}