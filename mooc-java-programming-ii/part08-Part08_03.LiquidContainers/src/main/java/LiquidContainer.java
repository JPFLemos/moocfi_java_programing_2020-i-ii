/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class LiquidContainer {
    
    private int contain;
    private int max;

    public LiquidContainer(int max) {
        this.contain = 0;
        this.max = max;
    }
    
    public void addLiquid(int amount) {
        this.contain += amount;
        
        if (this.contain > max) {
            this.contain = max;
        }
    }    
    
    public void removeLiquid(int amount) {
        this.contain -= amount;
        
        if (this.contain < 0) {
            this.contain = 0;
        }
    }

    public int getContain() {
        return contain;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return this.contain + "/" + this.max;
    }
    
    
    
}
