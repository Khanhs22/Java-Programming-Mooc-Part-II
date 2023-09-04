/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public enum Education {
    
    PHD ("Doctoral degree"),
    MA ("Masters degree"),
    BA ("Bachelors degree"),
    HS ("High School diploma");
        
    private String education;
    
    private Education(String string) {
        this.education = string;
    }

    public String getEducation() {
        return education;
    }
        
    

}
