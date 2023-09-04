/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class Book {

    private String name;
    private int ageRecommendtion;

    public Book(String name, int ageRecommendtion) {
        this.name = name;
        this.ageRecommendtion = ageRecommendtion;
    }

    public String getName() {
        return name;
    }

    public int getAgeRecommendtion() {
        return ageRecommendtion;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendtion +
                " year-olds or older)";
    }
    
    
}
