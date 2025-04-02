import java.util.Scanner;

class Deck
{
    public static String[] createSuit()
    {
        return new String[] {"Hearts", "Diamonds", "Clubs", "Spades"};
    }

    public static String[] createRank()
    {
        return new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    }

    public static String[] initialize()
    {
        String[] suits = createSuit();
        String[] ranks = createRank();
        int numOfCards = suits.length * ranks.length;

        String[] deck = new String[numOfCards];

        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < ranks.length; j++)
            {
                deck[(i * 13) + j] = ranks[j] + " of " + suits[i];
            }
        }

        return deck;
    }

    public static String[] shuffle(String[] deck)
    {
        String[] shuffled = deck;

        for (int i = 0; i < deck.length; i++)
        {
            int randomCardNumber = i + (int) (Math.random() * ((deck.length) - i));
            String temp = shuffled[i];
            shuffled[i] = shuffled[randomCardNumber];
            shuffled[randomCardNumber] = temp;
        }

        return shuffled;
    }


    public static String[][] play(int cardNumber, int players, String[] shuffled)
    {

        String[] deck1 = new String[cardNumber];

        for (int i = 0; i < deck1.length; i++)
        {
            deck1[i] = shuffled[i];
        }

        String[][] playDeck = new String[players][cardNumber/players];

        for (int i = 0; i < (cardNumber/players); i++)
        {
            for (int j = 0; j < players; j++)
            {
                playDeck[j][i] = deck1[(i * players) + j];
            }
        }

        return playDeck;

    }

    public static void display(String[][] playDeck)
    {
        for (int i = 0; i < playDeck.length; i++)
        {
            System.out.println("Player " + (i + 1) + "\'s Cards: ");
            for (int j = 0; j < playDeck[0].length; j++)
            {
                System.out.print(playDeck[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        String[] deck = initialize();
        String[] shuffled = shuffle(deck);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int players  = s.nextInt();
        System.out.println("Enter the number of cards: ");
        int cardNumber  = s.nextInt();

        if (cardNumber % players != 0)
        {
            System.out.println("The cards cannot be properly shuffled.");
        }
        else
        {
            String[][] playdeck = play(cardNumber, players, shuffled);
            display(playdeck);
        }

    }
}