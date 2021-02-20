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

public class Box implements Packable{
    
    private double maxCapacity;
    private ArrayList<Packable> itemsInTheBox;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.itemsInTheBox = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxCapacity) {
            this.itemsInTheBox.add(item);
        }
    }

    @Override
    public double weight() {
        double totalBoxWeight = 0;
        for (Packable item : this.itemsInTheBox) {
            totalBoxWeight += item.weight();
        }
        
        return totalBoxWeight;
    }

    @Override
    public String toString() {
        return "Box: " + this.itemsInTheBox.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
    
    
    
}
