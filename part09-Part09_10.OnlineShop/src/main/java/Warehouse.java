
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class Warehouse {
    
    private Map<String, Integer> priceOfProducts;
    private Map<String, Integer> stockOfProducts;

    public Warehouse() {
        
        this.priceOfProducts = new HashMap<>();
        this.stockOfProducts = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        
        this.priceOfProducts.put(product, price);
        this.stockOfProducts.put(product, stock);
    }
    
    public int price(String product) {
        
        for (String info : this.priceOfProducts.keySet()) {
            
            if (info.equals(product)) {
                return priceOfProducts.get(info);
            }
        }
        
        return -99;
    }
    
    public int stock(String product) {
        
        for (String info : this.stockOfProducts.keySet()) {
            
            if (info.equals(product)) {
                return stockOfProducts.get(info);
            }
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        
        int stockOfProduct = this.stock(product);
        
        if (stockOfProduct > 0) {
            
            this.stockOfProducts.put(product, stockOfProduct - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        
        Set<String> set = new HashSet<>();
        
        for (String infor : this.priceOfProducts.keySet()) {
            set.add(infor);
        }
        
        return set;
    }
}
