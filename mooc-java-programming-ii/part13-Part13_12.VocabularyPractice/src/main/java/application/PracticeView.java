/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;



/**
 *
 * @author joaop
 */
public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = this.dictionary.randomWord();

    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        
        Label translateThis = new Label("Translate the word '" + this.word + "'");
        TextField userAttempt = new TextField();
        Button checkBtn = new Button ("Check");
        Label answer = new Label("");
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        layout.add(translateThis, 0, 0);
        layout.add(userAttempt, 0, 1);
        layout.add(checkBtn, 0, 2);
        layout.add(answer, 0, 3);
        
        checkBtn.setOnMouseClicked((event) -> {
            if (dictionary.get(word).equals(userAttempt.getText())) {
                answer.setText("Correct!");
            } else {
                answer.setText("Incorrect! The translation of the word'" + word + "' is " + this.dictionary.get(word) + ".");
                return;
            }
            
            this.word = this.dictionary.randomWord();
            translateThis.setText("Translate the word '" + this.word + "'");
            userAttempt.clear();
        });
        
        return layout;
        
        
    }

}
