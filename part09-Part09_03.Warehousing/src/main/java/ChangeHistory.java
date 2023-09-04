
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
public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        
        double max = 0;
        
        for (double value : this.history) {
            
            if (max < value) {
                max = value;
            }
        }
        
        return max;
    }
    
    public double minValue() {
        
        if (this.history.size() == 0) {
            return 0;
        }
        
        double min = Double.MAX_VALUE;
        
        for (double value : this.history) {
            
            if (min > value) {
                min = value;
            }
        }
        
        return min;
    }
    
    public double average() {
        
        if (this.history.size() == 0) {
            return 0;
        }
        
        double sum = 0;
        
        for (double value : this.history) {
            
            sum += value;
        }
        
        return sum / this.history.size();
    }
}
