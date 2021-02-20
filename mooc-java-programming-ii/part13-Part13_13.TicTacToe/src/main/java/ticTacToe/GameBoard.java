package ticTacToe;

import java.util.List;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.layout.GridPane;
import javafx.scene.Parent;
import javafx.scene.control.Label;

/**
 *
 * @author joaop
 */
public class GameBoard {

    private String player;
    private List<Square> squares;
    private Label topLabel;

    public GameBoard() {
        this.player = "X";
        this.squares = gameBoardButtons();
        this.topLabel = new Label("Turn: " + this.player);
        this.topLabel.setFont(Font.font("Monospace", 40));

    }

    public Label getTopLabel() {
        return topLabel;
    }

    public String getPlayer() {

        return this.player;
    }

    public List<Square> gameBoardButtons() {
        ArrayList<Square> listOfSquares = new ArrayList<>();

        for (int i = 0; i < 9; i++) {

            Button btn = new Button(" ");
            btn.setFont(Font.font("Monospace", 40));
            btn.setOnAction((event) -> {
                if (btn.getText().equals(" ")) {
                    btn.setText(this.player);

                    if (this.player.equals("X")) {
                        this.player = "O";

                    } else if (this.player.equals("O")) {
                        this.player = "X";
                    }
                }

                if (this.isFinished()) {
                    this.topLabel.setText("The end!");
                    this.getView().setDisable(true);
                    return;
                }

                this.topLabel.setText("Turn: " + this.player);

            });

            listOfSquares.add(new Square(btn));
        }

        return listOfSquares;

    }

    public GridPane getView() {
        GridPane layout = new GridPane();

        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(10);
        layout.setHgap(10);

        for (int i = 0; i < 9; i++) {
            if (i < 3) {
                layout.add(this.squares.get(i).getButton(), 0, i);
            }

            if (i >= 3 && i < 6) {
                layout.add(this.squares.get(i).getButton(), 1, i - 3);
            }

            if (i >= 6 && i < 9) {
                layout.add(this.squares.get(i).getButton(), 2, i - 6);
            }
        }

        return layout;
    }

    public List<String> states() {
        List<String> states = new ArrayList<>();
        this.squares.stream()
                .map(square -> square.getButton().getText())
                .forEach(state -> states.add(state));

        return states;
    }

    public boolean isFinished() {
        List<String> states = this.states();

        if (!states.get(0).equals(" ") && states.get(0).equals(states.get(1)) && states.get(0).equals(states.get(2))) {
            return true;
        }

        if (!states.get(3).equals(" ") && states.get(3).equals(states.get(4)) && states.get(3).equals(states.get(5))) {
            return true;
        }

        if (!states.get(6).equals(" ") && states.get(6).equals(states.get(7)) && states.get(6).equals(states.get(8))) {
            return true;
        }

        if (!states.get(0).equals(" ") && states.get(0).equals(states.get(3)) && states.get(0).equals(states.get(6))) {
            return true;
        }

        if (!states.get(1).equals(" ") && states.get(4).equals(states.get(1)) && states.get(4).equals(states.get(7))) {
            return true;
        }

        if (!states.get(2).equals(" ") && states.get(2).equals(states.get(5)) && states.get(2).equals(states.get(8))) {
            return true;
        }

        if (!states.get(0).equals(" ") && states.get(0).equals(states.get(4)) && states.get(0).equals(states.get(8))) {
            return true;
        }

        if (!states.get(2).equals(" ") && states.get(2).equals(states.get(4)) && states.get(2).equals(states.get(6))) {
            return true;
        }

        return false;
    }
}
