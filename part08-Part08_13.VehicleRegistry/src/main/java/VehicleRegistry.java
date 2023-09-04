
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        
        if (this.owners.containsKey(licensePlate)) {

            return false;
        }
        
        this.owners.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
            
        return this.owners.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        
        if (this.owners.containsKey(licensePlate)) {
            
            this.owners.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates() {
        
        for (LicensePlate key : this.owners.keySet()) {
            
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        
        ArrayList<String> ownerList = new ArrayList<>();
        
        for (String value : this.owners.values()) {
            
            if (ownerList.contains(value)) {
                
                continue;
            }
            
            ownerList.add(value);
            System.out.println(value);
        }
    }
}
