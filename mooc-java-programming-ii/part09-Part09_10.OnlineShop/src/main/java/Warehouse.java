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
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.priceMap.put(product, price);
        this.stockMap.put(product, stock);
    }

    public int price(String product) {
        if (!this.priceMap.containsKey(product)) {
            return -99;
        }
        return this.priceMap.get(product);
    }

    public int stock(String product) {
        if (!this.stockMap.containsKey(product)) {
            return 0;
        }
        return this.stockMap.get(product);
    }

    public boolean take(String product) {
        if (!this.stockMap.containsKey(product)) {
            return false;
        }

        int productStock = this.stockMap.get(product);
        if (productStock == 0) {
            return false;
        }

        this.stockMap.replace(product, (productStock - 1));
        return true;
    }
    
    public Set<String> products() {
        return this.priceMap.keySet();
        
    }
    
    
}
