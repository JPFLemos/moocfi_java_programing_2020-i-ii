package ticTacToe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.geometry.Insets;

public class TicTacToeApplication extends Application {

//    private GameBoard gb;
//
//    @Override
//    public void init() throws Exception {
//        this.gb = new GameBoard();
//    }

    @Override
    public void start(Stage window) throws Exception {
        GameBoard gb = new GameBoard();

        BorderPane layout = new BorderPane();

        layout.setTop(gb.getTopLabel());
        layout.setCenter(gb.getView());

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
        

    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
        
    }

}
