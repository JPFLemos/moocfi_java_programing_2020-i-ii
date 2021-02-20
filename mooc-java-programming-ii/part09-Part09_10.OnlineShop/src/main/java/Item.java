/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Item {
    
    private String name;
    private int quantity;
    private int unitPrice;

    public Item(String name, int quantity, int unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.unitPrice * this.quantity;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.quantity;
    }
    
    
}
