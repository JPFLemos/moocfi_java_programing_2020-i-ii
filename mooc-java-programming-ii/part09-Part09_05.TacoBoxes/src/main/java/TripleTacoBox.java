/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class TripleTacoBox implements TacoBox {

    private int numberOfTacos;

    public TripleTacoBox() {
        this.numberOfTacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.numberOfTacos;
    }

    @Override
    public void eat() {
        if (this.numberOfTacos > 0) {
            this.numberOfTacos--;
        }
    }

}
