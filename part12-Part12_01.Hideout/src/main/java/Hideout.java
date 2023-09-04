/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class Hideout<T> {
    
    private T hide;

    public Hideout() {
        
        this.hide = null;
    }

    public void putIntoHideout(T toHide) {
        
        this.hide = toHide;
    }
    
    public T takeFromHideout() {
        
        T take = this.hide;
        this.hide = null;
        
        return take;
    }
    
    public boolean isInHideout() {
        
        return this.hide == null;
    }
}
