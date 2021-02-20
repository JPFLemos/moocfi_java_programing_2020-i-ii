/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        } else {

            return false;
        }

    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.registry.containsKey(licensePlate)) {
            return false;
        } else {
            this.registry.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate lp : this.registry.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<>();
        for (LicensePlate lp : this.registry.keySet()) {
            String owner = this.registry.get(lp);
            if (!ownersList.contains(owner)) {
                ownersList.add(owner);
            }
        }
        
        for (String owner : ownersList) {
            System.out.println(owner);
        }
    }
}
