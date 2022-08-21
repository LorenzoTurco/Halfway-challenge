import java.util.Random;

public class Card {
    String suit;
    int value;
    public Card(int value, String suit){

        this.suit = suit;
        this.value=value;
    }

    @Override
    public String toString(){

        return "|" + suit + " " + value + "|";
    }

    public int getNumber(){
        return this.value;
    }

    public String getSuit(){
        return this.suit;
    }



}
