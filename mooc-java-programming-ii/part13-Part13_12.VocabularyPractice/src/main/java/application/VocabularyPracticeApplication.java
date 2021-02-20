package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(dictionary.randomWord());
        InputView iv = new InputView(dictionary);
        PracticeView pv = new PracticeView(dictionary);

        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        menu.getChildren().addAll(enterButton, practiceButton);
        layout.setTop(menu);
        
        enterButton.setOnAction((event) -> layout.setCenter(iv.getView()));
        practiceButton.setOnAction((event) -> layout.setCenter(pv.getView()));
        layout.setCenter(iv.getView());
        
        Scene view = new Scene(layout, 400, 300);
        
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
        
    }

}
