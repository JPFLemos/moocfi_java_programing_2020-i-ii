/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Person {
    
    private String name;
    private Education Education;

    public Person(String name, Education Education) {
        this.name = name;
        this.Education = Education;
    }
    
    public Education getEducation() {
        return this.Education;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.Education;
    }
    
    
}
