
import java.util.ArrayList;
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
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        
        if (!this.storage.containsKey(unit)) {
            
            this.storage.put(unit, new ArrayList<>());
        }
        
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        
        this.storage.get(storageUnit).remove(item);
        
        if (this.storage.get(storageUnit).isEmpty()) {
            
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        
        ArrayList<String> nameList = new ArrayList<>();
        
        for (String name : this.storage.keySet()) {
            
            nameList.add(name);
        }
        
        return nameList;
    }
}
