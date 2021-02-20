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

public class Database {
    
    private ArrayList<Bird> birds;

    public Database() {
        
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
              
    }
    
    public void printOne(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name) || bird.getLatinName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
    
    public void printAll() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    
    public void observation(String name) {
        boolean obs = false;
        
        for (Bird bird : this.birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                    bird.observation(name);
                    obs = true;
            }        
        }
        
        if (!obs) {
            System.out.println("Not a bird!");
        } 
        
    }

    
}



