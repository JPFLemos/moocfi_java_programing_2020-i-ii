/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand handTwo) {
        Iterator<Card> iterator = hand.iterator();
        Iterator<Card> iteratorTwo = handTwo.hand.iterator();

        int handValue = 0;
        int handTwoValue = 0;

        while (iterator.hasNext()) {
            handValue += iterator.next().getValue();
        }

        while (iteratorTwo.hasNext()) {
            handTwoValue += iteratorTwo.next().getValue();
        }

        return handValue - handTwoValue;

    }
    
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }

}
