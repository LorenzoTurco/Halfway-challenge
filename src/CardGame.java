import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CardGame{
    List<Card> deckOfCards = new ArrayList<Card>();

    public CardGame(){

        initializeDeck();
        shuffleDeck();
    }
    public void initializeDeck(){
        final String[] SUIT = {"heart","club", "diamond", "spade"};
        final int[] SINGLE_DECK_VALUES_TEMPLATE = {1,2,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        final String[] SINGLE_DECK_SYMBOL_TEMPLATE = {"1","2","3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


        for(int i = 0; i<SINGLE_DECK_VALUES_TEMPLATE.length*4; i++){
            deckOfCards.add(new Card(SINGLE_DECK_VALUES_TEMPLATE[i%13], SUIT[(int) Math.floor(deckOfCards.size()/13)], SINGLE_DECK_SYMBOL_TEMPLATE[i%13]));
        }
    }

    public Card dealCard(){
        return this.deckOfCards.get(0);
    }

    public List<Card> sortDeckInNumberOrder(){

        shuffleDeck();
        Collections.sort(this.deckOfCards, (a,b) -> a.getNumber() - b.getNumber());
        System.out.println(this.deckOfCards.toString());

        return this.deckOfCards;
    }

    public List<Card> sortDeckIntoSuits(){

        shuffleDeck();

        Collections.sort(this.deckOfCards, (a,b) -> a.getSuit().compareTo(b.getSuit()));
        System.out.println(this.deckOfCards.toString());

        return this.deckOfCards;
    }

    public List<Card> shuffleDeck(){

        Collections.shuffle(this.deckOfCards);
        return this.deckOfCards;
    }

    public List<Card> getDeck(){
        return this.deckOfCards;
    }
}
