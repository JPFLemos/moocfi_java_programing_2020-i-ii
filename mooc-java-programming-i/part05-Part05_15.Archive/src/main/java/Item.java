/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Item {
    
        private String name;
        private String identifier;

    public Item() {
    }

    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!(obj instanceof Item)) {
            return false;
        }
        
        Item objItem = (Item) obj;
        
        return (this.identifier.equals(objItem.identifier));                
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
        
       
}
