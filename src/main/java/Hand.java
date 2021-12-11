
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gio
 */
public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    public void print() {
        cards.stream().forEach(action -> System.out.println(action));
    }

    public int sumOfCards() {
        int sum = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            sum += cards.get(i).getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand other) {

        return this.sumOfCards() - other.sumOfCards();
    }

}
