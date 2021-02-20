/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java.util.ArrayList;

public class RecipeList {
    
    private ArrayList<Recipe> recipeList;
    
    public RecipeList(){
        this.recipeList = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipeList.add(recipe);
    }
    
    public void print(){
        for (Recipe recipe : this.recipeList) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
        }
    }

    public ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }
        
    public void searchByName(String name) {
        for (Recipe recipe : this.recipeList) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(recipe);
        }
        }
    }
    
    public void searchByCookingTime(int maxCookingTime) {
        for (Recipe recipe : this.recipeList) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
                System.out.println(recipe.getIngredients());
            }
        }
    }
    
    public void searchByIngredient(String ingredient) {
        for (Recipe recipe : this.recipeList) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
    
        }
    }
    
    
}
