
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class ShoppingCart {
    
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        
        if (!this.items.containsKey(product)) {
        
            this.items.put(product, new Item(product, 1, price));
        } else {
            
            Item had = this.items.get(product);
            had.increaseQuantity();
            this.items.put(product, had);
        }
        
    }
    
    public int price() {
        
        int sum = 0;
        
        for (Item item : this.items.values()) {
            sum += item.price();
        }
        
        return sum;
    }
    
    public void print() {
        
        for (Item item : this.items.values()) {
            System.out.println(item);
        }
    }
}
