package collection.compare.test.myresolve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static collection.compare.test.myresolve.Card.*;

public class Deck {

    private List<Card> cardDeck = new ArrayList<>();
    private int count = 0;

    public Deck() {
        initCard();
    }

    public void shuffleDeck() {
        Collections.shuffle(cardDeck);
    }

    public List<Card> getCards() {
        if (count > 51) {
            System.out.println("카드를 다 뽑았습니다.");
            return null;
        }

        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cards.add(cardDeck.get(count++));
        }
        return cards;
    }

    private void initCard() {
        for (int i = 1; i < 14; i++) {
            cardDeck.add(new Card(i, SPADE));
            cardDeck.add(new Card(i, DIAMOND));
            cardDeck.add(new Card(i, HEART));
            cardDeck.add(new Card(i, CLOVER));
        }
    }
}
