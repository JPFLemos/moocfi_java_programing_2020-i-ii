/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Container {
    
    private int contain;
    private int max;

    public Container() {
        this.contain = 0;
        this.max = 100;
    }
    
    

    public Container(int max) {
        this.contain = 0;
        this.max = max;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.contain += amount;

            if (this.contain > max) {
                this.contain = max;
            }
    }   } 
    
    public void remove(int amount) {
        if (amount > 0) {
            this.contain -= amount;

            if (this.contain < 0) {
                this.contain = 0;
            }
        }    
    }

    public int contains() {
        return contain;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return this.contain + "/100";
    }
    
    
    
}
