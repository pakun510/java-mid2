package collection.compare.test.myresolve;

public class CardGameMain {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffleDeck();
        Player player1 = new Player(deck.getCards());
        Player player2 = new Player(deck.getCards());

        System.out.println("플레이어1의 카드: " + player1.showCards() + ", 합계: " + player1.sumCardsNumber());
        System.out.println("플레이어2의 카드: " + player2.showCards() + ", 합계: " + player2.sumCardsNumber());
        resultCardGame(player1, player2);

    }
    
    static void resultCardGame(Player player1, Player player2) {
        if (player1.sumCardsNumber() > player2.sumCardsNumber()) {
            System.out.println("플레이어1 승리");
        } else if (player1.sumCardsNumber() < player2.sumCardsNumber()) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        } 
            
            
    }
}
