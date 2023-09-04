/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class Item {
    
    private String product;
    private int qty;
    private int unitPice;

    public Item(String product, int qty, int unitPice) {
        this.product = product;
        this.qty = qty;
        this.unitPice = unitPice;
    }
    
    public int price() {
        return this.qty * this.unitPice;
    }
    
    public void increaseQuantity() {
        this.qty++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
    
    
}
