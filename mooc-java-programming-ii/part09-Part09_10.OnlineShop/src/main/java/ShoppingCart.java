/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item itemToAdd = new Item(product, 1, price);
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, itemToAdd);
        }
    }

    public int price() {
        int totalPrice = 0;

        for (Item item : this.cart.values()) {

            totalPrice += item.price();
        }

        return totalPrice;

    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }

}
