package cards;

public class Main {
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = deck.get(5);
        System.out.printf("Suit: %s Name: %s Value: %d", card.getSuit(), card.getName(), card.getValue());
    }
}
