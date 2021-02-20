/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author joaop
 */
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String fileName;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();

    }

    public SaveableDictionary(String file) {
        this();
        this.fileName = file;
    }

    public boolean load() {
        try ( Scanner scanner = new Scanner(Paths.get(this.fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                String word = parts[0];
                String translation = parts[1];
                this.add(word, translation);

            }

            return true;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return false;
        }

    }

    public boolean save() {
        ArrayList<String> uniqueKeys = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        
        try ( PrintWriter writer = new PrintWriter(this.fileName)) {
            
        
        this.dictionary.keySet().stream().forEach(word -> {
            if (uniqueKeys.contains(word) | uniqueKeys.contains(this.dictionary.get(word))) {
                return;
            }
            uniqueKeys.add(word);
        });

//        for (String word : this.dictionary.keySet()) {
//            if (uniqueKeys.contains(word) | uniqueKeys.contains(this.dictionary.get(word))) {
//                continue;
//            }
//            uniqueKeys.add(word);
//        }

        uniqueKeys.stream().forEach(word -> {
            String line = word + ":" + this.dictionary.get(word);
            writer.println(line);
        });
        
        
//        for (String word : uniqueKeys) {
//            String line = word + ":" + this.dictionary.get(word);
//            lines.add(line);
//        }

        
//            for (String line : lines) {
//                writer.println(line);
//            }
            writer.close();

            return true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
        this.dictionary.putIfAbsent(translation, word);
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            String translation = this.dictionary.get(word);
            this.dictionary.remove(word);
            this.dictionary.remove(translation);
        }

    }

}
