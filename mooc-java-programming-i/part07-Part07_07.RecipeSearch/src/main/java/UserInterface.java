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
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {

    private RecipeList recipeList;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.recipeList = new RecipeList();
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("File to Read:");
        String fileName = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: File not found" + e.getMessage());
        }

        lines.add("");
        String recipeName = "";
        int cookingTime = 0;
        ArrayList<String> ingredientList = new ArrayList<>();
        int index = 1;
        for (String line : lines) {

            if (index == 1) {
                recipeName = line;
                //ingredientList = new ArrayList<>();
                index++;
                continue;
            }

            if (index == 2) {
                cookingTime = Integer.valueOf(line);
                index++;
                continue;
            }

            if (index >= 3) {
                if (!line.equals("")) {
                    ingredientList.add(line);
                    index++;
                    continue;

                } else if (line.equals("")) {
                    Recipe recipe = new Recipe(recipeName, cookingTime, ingredientList);
                    recipeList.addRecipe(recipe);
                    ingredientList = new ArrayList<>();
                    index = 1;
                    continue;
                }

            }
        }
                  
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - search recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");  
        
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            String cmd = scanner.nextLine();

            if (cmd.equals("stop")) {
                break;
            }

            if (cmd.equals("list")) {
                System.out.println("");
                System.out.println("Recipes");
                this.recipeList.print();
            }
            
            if (cmd.equals("find name")){
                System.out.println("Search word:");
                String searchName = scanner.nextLine();
                
                System.out.println("");
                System.out.println("Recipes:");
                this.recipeList.searchByName(searchName);
                
            }
            
            if (cmd.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                
                System.out.println("");
                System.out.println("Recipes:");
                this.recipeList.searchByCookingTime(maxCookingTime);
            }
            
            if (cmd.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                
                System.out.println("");
                System.out.println("Recipes");
                this.recipeList.searchByIngredient(ingredient);
            }

        }

    }

}
