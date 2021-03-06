/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class InputView {

    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label word = new Label("Word:");
        TextField wordField = new TextField();
        Label translation = new Label("Translation: ");
        TextField translationField = new TextField();
        Button addPair = new Button("Add the word pair");

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(word, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(translation, 0, 2);
        layout.add(translationField, 0, 3);
        layout.add(addPair, 0, 4);
        
        addPair.setOnMouseClicked((event) -> {
            String wordInput = wordField.getText();
            String translationInput = translationField.getText();
            
            dictionary.addWord(wordInput, translationInput);
            
            wordField.clear();
            translationField.clear();
        });

        return layout;
    }
}
