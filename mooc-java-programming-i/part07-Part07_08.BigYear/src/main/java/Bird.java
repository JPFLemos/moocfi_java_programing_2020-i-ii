/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void observation(String name) {
        if (this.name.equalsIgnoreCase(name) || this.latinName.equalsIgnoreCase(name)) {
            this.observations++;
        }
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    @Override
    public String toString() {
        if (this.observations == 1) {
            return this.name + " (" + this.latinName + "): " + this.observations + " observation";
        } else {
            return this.name + " (" + this.latinName + "): " + this.observations + " observations";

        }
    }

}
