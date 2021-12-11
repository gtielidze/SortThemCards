
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gio
 */

public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card first, Card second) {
        if (first.getSuit().ordinal() > second.getSuit().ordinal()) {
            return 1;
        } else if (first.getSuit().ordinal() < second.getSuit().ordinal()) {
            return -1;
        } else {
            return first.getValue() - second.getValue();
        }
    }
}
