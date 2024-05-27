package collection.compare.test.myresolve;

import java.util.List;

public class Player {

    private List<Card> cards;

    public Player(List<Card> cards) {
        this.cards = cards;
        cards.sort(null);
    }

    public int sumCardsNumber() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getCardNumber();
        }
        return sum;
    }

    public String showCards() {
        return cards.toString();
    }

}
