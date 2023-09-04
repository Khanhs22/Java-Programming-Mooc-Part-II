
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        
        this.cards.add(card);
    }
    
    public void print() {
        
        this.cards.stream().forEach(s -> {
            System.out.println(s);
        });
    }
    
    public void sort() {
        
        Comparator<Card> comparator = Comparator
              .comparing(Card::getValue)
              .thenComparing(Card::getSuit);

        Collections.sort(cards, comparator);
    }
    
    public void sortBySuit() {
        
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand2) {
        
        if (hand2.cards.size() == 0) {
            return 0;
        }
        
        int value1 = this.cards.stream()
                .mapToInt(s -> Integer.valueOf(s.getValue()))
                .sum();
        
        int value2 = hand2.cards.stream()
                .mapToInt(s -> Integer.valueOf(s.getValue()))
                .sum();
        
        return value1 - value2;
    }
}
