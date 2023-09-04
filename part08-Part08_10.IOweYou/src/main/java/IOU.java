
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class IOU {
    
    private HashMap<String, Double> list;

    public IOU() {
        
        this.list = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        
        if (this.list.containsKey(toWhom)) {
            
            double owe = this.list.get(toWhom);
            owe += amount;
            this.list.put(toWhom, owe);
        } else {
            
            this.list.put(toWhom, amount);
        }
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        
        return this.list.getOrDefault(toWhom, 0.0);
    }
}
