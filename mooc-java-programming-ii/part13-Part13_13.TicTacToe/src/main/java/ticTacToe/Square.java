package ticTacToe;

import javafx.scene.control.Button;

/**
 *
 * @author joaop
 */
public class Square {

    private Button btn;

    public Square(Button btn) {
        this.btn = btn;

    }

    public Button getButton() {
        return this.btn;
    }

}
