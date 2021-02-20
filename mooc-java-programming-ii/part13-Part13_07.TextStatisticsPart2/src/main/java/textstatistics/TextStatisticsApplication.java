package textstatistics;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox texts = new HBox();
        texts.setSpacing(30);
        Label letterCounter = new Label("Letters: 0");
        texts.getChildren().add(letterCounter);

        Label wordCounter = new Label("Words: 0");
        texts.getChildren().add(wordCounter);

        Label longestWordText = new Label("The longest word is: ");
        texts.getChildren().add(longestWordText);

        Label teja = new Label("");
        texts.getChildren().add(teja);

        TextArea textArea = new TextArea("Teja is the secret");

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst().get();

            letterCounter.setText("Letters: " + characters);
            wordCounter.setText("Words: " + words);
            longestWordText.setText("The longest word is: " + longest);
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equalsIgnoreCase("teja")) {
                    teja.setText("scemo chi scrive");
                    break;
                } else {
                   teja.setText("");
                }

            }

        });

        layout.setCenter(textArea);

        layout.setBottom(texts);

        Scene view = new Scene(layout);
        window.setTitle("Teja text");
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
