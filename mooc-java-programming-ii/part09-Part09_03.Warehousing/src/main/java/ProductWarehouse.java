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

public class ProductWarehouse extends Warehouse {
    
    private String name;
    
    

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    

    @Override
    public String toString() {
        return this.name + ": " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
