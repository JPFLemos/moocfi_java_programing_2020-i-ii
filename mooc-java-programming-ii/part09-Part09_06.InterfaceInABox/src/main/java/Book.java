/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Book implements Packable {
    
    private String author;
    private String title;
    private double weigth;

    public Book(String author, String title, double weigth) {
        this.author = author;
        this.title = title;
        this.weigth = weigth;
    }

    @Override
    public double weight() {
        return this.weigth;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.title;
    }
    
    
    
}
