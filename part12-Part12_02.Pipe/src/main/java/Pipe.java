
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
public class Pipe<T> {
    
    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        
        this.values.add(value);
    }
    
    public T takeFromPipe() {
        
        if (this.values.isEmpty()) {
            return null;
        }
        
        T take = this.values.get(0);
        this.values.remove(0);
        
        return take;
    }
    
    public boolean isInPipe() {
        
        return !this.values.isEmpty();
    }
}
