/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class CustomTacoBox implements TacoBox {

    private int numberOfTacos;

    public CustomTacoBox(int numberOfTacos) {
        this.numberOfTacos = numberOfTacos;
    }

    @Override
    public void eat() {
        if (this.numberOfTacos > 0) {
            this.numberOfTacos--;
        }
    }

    @Override
    public int tacosRemaining() {
        return this.numberOfTacos;
    }

}
