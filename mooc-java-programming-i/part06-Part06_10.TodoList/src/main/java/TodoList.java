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

public class TodoList {
    
    private ArrayList <String> thingsToDo;
    
    public TodoList() {
        thingsToDo = new ArrayList<>();
    }
    
    public void add(String task) {
        thingsToDo.add(task);
    }
    
    public void print() {
        for (String task : this.thingsToDo){
            System.out.println((thingsToDo.indexOf(task)+ 1)+ ": "+ task);
        }
    }
    
    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index >= this.thingsToDo.size()){
            return;
        }
        
        thingsToDo.remove(index);
    }
}   
