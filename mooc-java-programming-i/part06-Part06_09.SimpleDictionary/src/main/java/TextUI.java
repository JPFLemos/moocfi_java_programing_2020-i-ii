/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java.util.Scanner;
import java.util.HashMap;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            }
            
            processCommand(command);
            System.out.println("");
        }

    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
        System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String wordTranslation = scanner.nextLine();

        dictionary.add(word, wordTranslation);
    }

    public void search() {
        System.out.println("To be translated:");
        String wordToBeTranslated = scanner.nextLine();

        if (this.dictionary.translate(wordToBeTranslated) == null) {
            System.out.println("Word " + wordToBeTranslated + " was not found");
        } else {
            System.out.println(this.dictionary.translate(wordToBeTranslated));
        }
    }

}
