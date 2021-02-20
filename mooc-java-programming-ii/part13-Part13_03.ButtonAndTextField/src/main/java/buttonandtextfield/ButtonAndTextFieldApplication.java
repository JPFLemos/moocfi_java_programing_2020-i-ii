package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) {
        Button button = new Button("Botone TEJA");
        TextField textField = new TextField("TEIJA");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textField);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }
     
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
