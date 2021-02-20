/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author joaop
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class UI extends Application {

    @Override
    public void start(Stage stage) {

        Button buttonOne = new Button("To the second view!");
        Button buttonTwo = new Button("To the third view!");
        Button buttonThree = new Button("To the first view!");

        Label labelOne = new Label("First view!");
        Label labelTwo = new Label("Second View!");
        Label labelThree = new Label("Third View!");

        BorderPane firstView = new BorderPane();
        firstView.setTop(labelOne);
        firstView.setCenter(buttonOne);

        VBox secondView = new VBox();
        secondView.getChildren().addAll(buttonTwo, labelTwo);

        GridPane thirdView = new GridPane();
        thirdView.add(labelThree, 0, 0);
        thirdView.add(buttonThree, 1, 1);

        Scene first = new Scene(firstView);
        Scene second = new Scene(secondView);
        Scene third = new Scene(thirdView);

        buttonOne.setOnAction((event) -> {
            stage.setScene(second);
        });

        buttonTwo.setOnAction((event) -> {
            stage.setScene(third);
        });

        buttonThree.setOnAction((event) -> {
            stage.setScene(first);
        });
        
        stage.setScene(first);
        stage.show();

    }
}
