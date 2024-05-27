package collection.compare.test.myresolve;

public class Card implements Comparable<Card> {

    public static final int SPADE = 1;
    public static final int HEART = 2;
    public static final int DIAMOND = 3;
    public static final int CLOVER = 4;

    private int cardNumber;
    private int mark;

    public Card(int cardNumber, int mark) {
        this.cardNumber = cardNumber;
        this.mark = mark;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return cardNumber + "(" + toMark() + ")";
    }

    private String toMark() {
        return switch (mark) {
            case SPADE -> "♠";
            case HEART -> "♥";
            case DIAMOND -> "♦";
            case CLOVER -> "♣";
            default -> null;
        };
    }

    @Override
    public int compareTo(Card o) {

        if (this.cardNumber < o.cardNumber) {
            return -1;
        } else if (this.cardNumber == o.cardNumber) {
            return Integer.compare(this.mark, o.mark);
        } else {
            return 1;
        }

    }
}
