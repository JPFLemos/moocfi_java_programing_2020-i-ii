/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */

import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> dati;
    
    public Stack() {
        this.dati = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.dati.isEmpty();
    }
    
    public void add(String value) {
        this.dati.add(0, value);
    }
    
    public ArrayList<String> values() {
        return this.dati;
    }
    
    public String take() {
        String topMostValue = this.dati.get(0);
        this.dati.remove(0);
        return topMostValue;
    }
}
