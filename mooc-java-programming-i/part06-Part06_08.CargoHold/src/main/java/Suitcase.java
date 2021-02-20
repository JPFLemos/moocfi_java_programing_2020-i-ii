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

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        if (items.isEmpty()) {
            return 0;
        }
        
        int totalWeight = 0;
        for (Item i : this.items) {
            totalWeight += i.getWeight();
        }
        
        return totalWeight;
    }

    public void addItem(Item item) {

        if (totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item i : this.items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        for (Item i : items) {
            if (i.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = i;
            }
        }
        
        return heaviestItem;
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
