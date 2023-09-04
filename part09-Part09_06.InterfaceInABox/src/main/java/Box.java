
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
public class Box implements Packable {
    
    private ArrayList<Packable> items;
    private double capacity;

    public Box(double capacity) {
        
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        
        if (this.weight()+ item.weight() < this.capacity) {
            
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        
        double weight = 0;
        
        for (Packable itemOnBox : this.items) {
            weight += itemOnBox.weight();
        }
        
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + 
                this.weight()+ " kg";
    }
    
}
