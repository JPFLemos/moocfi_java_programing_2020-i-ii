package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;

public class JokeApplication extends Application {
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(0, 20, 20, 20));
        menu.setSpacing(10);
        
        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");
        
        menu.getChildren().addAll(first, second, third);
        
        layout.setTop(menu);
        
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("Because reasons.");
        
        first.setOnAction((event) -> layout.setCenter(firstLayout));
        second.setOnAction((event) -> layout.setCenter(secondLayout));
        third.setOnAction((event) -> layout.setCenter(thirdLayout));
        
        layout.setCenter(firstLayout);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(250, 150);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
