package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {

        Label instruction = new Label("Enter your name and start.");
        TextField enterName = new TextField("");
        Button startBtn = new Button("Start");

        GridPane layoutOne = new GridPane();

        layoutOne.add(instruction, 0, 0);
        layoutOne.add(enterName, 0, 1);
        layoutOne.add(startBtn, 0, 2);

        layoutOne.setPrefSize(300, 200);
        layoutOne.setAlignment(Pos.CENTER);
        layoutOne.setVgap(10);
        layoutOne.setHgap(10);
        layoutOne.setPadding(new Insets(20, 20, 20, 20));

        Scene startView = new Scene(layoutOne);

        Label welcomeText = new Label();

        StackPane layoutTwo = new StackPane();
        layoutTwo.setPrefSize(300, 200);
        layoutTwo.getChildren().add(welcomeText);
        layoutTwo.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(layoutTwo);

        startBtn.setOnAction((event) -> {
            welcomeText.setText("Welcome " + enterName.getText() + "!");
            window.setScene(welcomeView);

        });

        window.setScene(startView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
