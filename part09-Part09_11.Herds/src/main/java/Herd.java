
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
public class Herd implements Movable {
    
    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }
            
    @Override
    public void move(int dx, int dy) {
        
        for (Movable one : list) {
            one.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    @Override
    public String toString() {
        
        String print = "";
        
        for (Movable one : list) {
            print += one.toString() + "\n";
        }
        
        return print;
    }
    
    
}
