/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Literacy {

    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacy;

    public Literacy(String theme, String ageGroup, String gender, String country, int year, double literacy) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacy = literacy;
    }
    
    public String getGender(){
        if (this.gender.contains("female")) {
            return "female";
        } else {
            return "male";
        }
    }
    
    public double getLiteracy(){
        return this.literacy;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.getGender() + ", " + this.literacy;
    }
    
    

}
