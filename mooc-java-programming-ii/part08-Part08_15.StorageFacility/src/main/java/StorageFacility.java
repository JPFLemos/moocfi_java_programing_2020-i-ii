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
import java.util.HashMap;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add (String unit, String item) {
        this.storage.putIfAbsent(unit,new ArrayList<>());
        
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.containsKey(storageUnit)){
            return this.storage.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String Item) {
        this.storage.get(storageUnit).remove(Item);
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.storage.keySet()) {
            units.add(unit);
        }
        
        return units;
    }
    
    
    
}
