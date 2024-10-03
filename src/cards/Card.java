package cards;

public class Card {

    //members of the class
    private final String name;
    private final String suit;
    private final int value;

    //Constructor (You cannot create a blank card -- requirements)
    public Card(String suit ,String name, int value){
        this.suit = suit;
        this.name = name;
        this.value = value;
    }
    
    public String getName() {
        return name;
    }
    public String getSuit() {
        return suit;
    }

    public int getValue(){
        return value;
    }
    
    @Override
    public String toString(){
        return "Card(Suit: %s Name: %s Value: %d)".formatted(suit, name, value);
    }
    

    
}
