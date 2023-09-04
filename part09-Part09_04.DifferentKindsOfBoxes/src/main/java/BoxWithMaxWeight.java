
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        
        int weightOfBox = 0;
        
        for (Item itemOfBox : items) {
            
            weightOfBox += itemOfBox.getWeight();
        }
        
        if ((weightOfBox + item.getWeight()) <= this.capacity) {
            
            this.items.add(item);
        }    
    }

    @Override
    public boolean isInBox(Item item) {
        
        return this.items.contains(item);
    }
    
}
