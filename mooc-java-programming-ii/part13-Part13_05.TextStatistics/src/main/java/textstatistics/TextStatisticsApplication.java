package textstatistics;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.Scene;

public class TextStatisticsApplication extends Application{
    
    @Override public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        HBox texts = new HBox();
        texts.getChildren().add(new Label("Letters: 0"));
        texts.getChildren().add(new Label("Words: 0"));
        texts.getChildren().add(new Label("The longest word is: "));
        
        layout.setCenter(new TextArea(""));
        layout.setBottom(texts);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
        
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
