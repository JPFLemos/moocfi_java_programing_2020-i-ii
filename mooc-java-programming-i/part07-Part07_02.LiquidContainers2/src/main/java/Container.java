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

    private int amountIn;

    public Container() {
        this.amountIn = 0;
    }

    public int contains() {
        return this.amountIn;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amountIn += amount;

            if (this.amountIn > 100) {
                this.amountIn = 100;
            }
        }
    }

    public void remove(int amount) {
        this.amountIn -= amount;

        if (this.amountIn < 0) {
            this.amountIn = 0;
        }
    }

    public String toString() {
        return amountIn + "/100";
    }
}
