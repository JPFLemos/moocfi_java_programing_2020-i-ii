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

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        if (suitcases.isEmpty()) {
            return 0;
        }

        int totalWeight = 0;
        for (Suitcase i : suitcases) {
            totalWeight += i.totalWeight();
        }

        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase i : this.suitcases) {
            i.printItems();
        }
    }
    
    public String toString() {
        if (suitcases.isEmpty()) {
            return "0 suitcases (0 kg)";
        }
        
        if (suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
        
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
