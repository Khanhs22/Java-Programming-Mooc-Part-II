/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class OneItemBox extends Box {


    private String item;

    public OneItemBox() {
        this.item = "";
    }
    
    @Override
    public void add(Item item) {
        
        if (this.item.isEmpty() || this.item.equals(item.getName())) {
            
            this.item = item.getName();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item.equals(item.getName());
    }
    
}
