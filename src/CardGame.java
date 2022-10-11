import java.util.Scanner;

public class CardGame {
    public static void main(String [] args) {
        String [] suits = {"spades", "diamonds", "hearts", "clubs"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

        for(String suit: suits) {
            for(String rank: ranks) {
                System.out.println(rank + " of " + suit);
            }
        }
        System.out.println();


        //represent a deck of cards with an int array
        int [] deck = new int[52];

        //use a loop to initialize the values to 0-51
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        //0 - Ace of spades, 1 - 2 of spades, ... , 12 - king of spades
        // 13 - Ace of diamonds...
        // 26 - Ace of hearts...
        // 39 - Ace of clubs, ..., 51 - King of clubs

        for (int i = 0; i < 52; i++) {
            //use the card's value to map to the correct rank and suit
            //combination
            int cardValue = deck[i];

            //mod 13 will produce [0, 12]
            int rankI = cardValue % 13;

            //int division to produce the correct suit
            //[0-12] divided by 13 --> 0
            //[13-25] divided by 13 --> 1
            int suitI = cardValue / 13;

            String rank = ranks[rankI];
            String suit = suits[suitI];
            System.out.println("Card value: " + cardValue + " is the "
            + rank + " of " + suit);

        }

        //shuffle the array of ints
        //use random indices and swap values
        for (int i = 0; i < 200; i++) {
            int index1 = (int)(Math.random()*52);
            int index2 = (int)(Math.random()*52);

            int temp = deck[index1];
            deck[index1] = deck[index2];
            deck[index2] = temp;
        }

        System.out.println();

        for (int i = 0; i < 52; i++) {
            int cardValue = deck[i];
            int rankI = cardValue % 13;
            int suitI = cardValue / 13;

            String rank = ranks[rankI];
            String suit = suits[suitI];
            System.out.println("Card value: " + cardValue + " is the "
                    + rank + " of " + suit);
        }
        System.out.println();

        //7 cards in the hand
        int [] hand = new int[7];

        int top = 0;
        //use a variable track where the "top" of the undrawn deck is because
        //array sizes can't change and this avoids moving cards around in the deck

        //draw the first 7 cards from the deck to add to the hand
        for (int i = 0; i < hand.length; i++) {
            hand[i] = deck[top];
            top++;
        }

        //print the hand and include the index of the card position in the hand
        //and the rank and suit
        for (int i = 0; i < hand.length; i++) {
            int cardValue = hand[i];
            int rankI = cardValue % 13;
            int suitI = cardValue / 13;

            String rank = ranks[rankI];
            String suit = suits[suitI];

            System.out.println("Card " + i + " - " + rank + " of " + suit);
        }

        //ask the user for the index of a card in their hand they want
        // to discard to replace with a new card drawn from the deck,
        // repeat until they get 4 of a kind in their hand
        // or until there are no more cards in the deck
        Scanner s = new Scanner(System.in);

        //while no four-of-kind and top < 52:
        //  ask which card index to replace
        //  get a new card for that index
        //  update the top variable
        //  check if there's four-of-kind

        boolean fourOfKind = false;
        while (fourOfKind == false && top < 52) {
            System.out.println("enter the index of the card to replace");
            int handIndex = s.nextInt();

            //get new card from deck
            int newCard = deck[top];
            top++;

            //replace the user-indicated card with new card
            hand[handIndex] = newCard;

            //print updated hand
            for (int i = 0; i < hand.length; i++) {
                int cardValue = hand[i];
                int rankI = cardValue % 13;
                int suitI = cardValue / 13;

                String rank = ranks[rankI];
                String suit = suits[suitI];

                System.out.println("Card " + i + " - " + rank + " of " + suit);
            }


        }







        }
}
