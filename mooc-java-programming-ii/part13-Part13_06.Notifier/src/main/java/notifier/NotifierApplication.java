package notifier;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        VBox layout = new VBox();
        
        TextField textfield = new TextField();
        Label text = new Label("");
        Button buttonOne = new Button("Update");
        
        buttonOne.setOnAction((event) -> {
            text.setText(textfield.getText());
        });
        
        layout.getChildren().addAll(textfield, buttonOne, text);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
