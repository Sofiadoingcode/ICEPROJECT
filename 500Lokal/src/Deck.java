import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public ArrayList<Card> deck = new ArrayList<>();
    private String[] suits = {"heart  ", "spade  ", "club   ", "diamond"};
    private int[] numbers = {1, 11, 12, 13, 10, 2, 3, 4, 5, 6, 7, 8, 9};
    private String[] cardNames = {"ace   ", "knight", "queen ", "king  ", "number"};
    private int[] pointValues = {15, 10, 5};
    int amountOfJokers = Game.amountOfJokers;


    public void createDeck () {
        for(int i = 0; i< suits.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                String cardName;
                int pointValue;
                if(j >= 0 && j<=3) {
                    cardName = cardNames[j];
                    if(numbers[j] == 1) {
                        pointValue = pointValues[0];
                    } else {
                        pointValue = pointValues[1];
                    }
                } else {
                    cardName = cardNames[4];
                    if (numbers[j] == 10) {
                        pointValue = pointValues[1];
                    } else {
                        pointValue = pointValues[2];
                    }
                }

                Card card = new Card(suits[i], numbers[j], cardName, pointValue);
                deck.add(card);
            }
        }
        if (amountOfJokers > 0) {
            for (int k = 0; k < amountOfJokers; k++) {
                Card joker = new Card("joker ", 25);
                deck.add(joker);
            }
        }

        Collections.shuffle(deck);
    }



}
