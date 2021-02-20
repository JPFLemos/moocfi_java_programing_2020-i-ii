/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java
import java.util.ArrayList;

public class OneItemBox extends Box {
     
    private ArrayList<Item> item;

    public OneItemBox() {
        this.item = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.item.isEmpty()) {
            this.item.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.item.isEmpty()) {
            return false;
        }
        
        return this.item.contains(item);
    }
    
    
    
    
    
    
}
