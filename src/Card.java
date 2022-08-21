import java.util.HashMap;

public class Card {
    String suit;
    int value;
    String symbol;

    final static HashMap<String, Character> suitUnicode = new HashMap<String, Character>(){{
        put("heart", '\u2764');
        put("club", '\u2663');
        put("diamond", '\u2666');
        put("spade", '\u2660');
    }};


    public Card(int value, String suit, String symbol){
        this.suit = suit;
        this.value=value;
        this.symbol = symbol;
    }

    @Override
    public String toString(){

        return  "|" + this.symbol + " "+  suitUnicode.get(this.suit) + "|";
    }

    public int getNumber(){
        return this.value;
    }

    public String getSuit(){
        return this.suit;
    }



}
