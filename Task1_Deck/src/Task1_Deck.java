import java.util.ArrayList;

public class Task1_Deck {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();

        //CardSuit[] suits = CardSuit.values();
        for (int i = 0; i < CardSuit.values().length; i++) {
            //CardSuit s = suits[i];

            //CardRank[] ranks = CardRank.values();
            for (int j = 0; j < CardRank.values().length; j++) {
               //CardRank r = ranks[j];

                String suit = CardSuit.values()[i].name();
                String rank = CardRank.values()[j].name();
                cards.add(new Card(suit, rank));
            }
            System.out.println(cards.toString());
        }
    }
}
