
/**
 * This programs runs the clock solitaire game 
 * 
 * @author Andrew Wilson 
 * @version 5/6/2017
 */
public class ClockSolitaire
{
    public static void main (String [] args)
    {
        //declaration of variables
        String printLev = new String();
        int gamesToPlay;
        int level;
        int [] score;

        if (args.length == 0)
        {//if the cmd line is not used for args
            gamesToPlay = 1;//default single game
            level = 0;//default normal print
            score = new int[1];//default game size
        }
        else
        {
            gamesToPlay = Integer.parseInt(args[1]);//use arg as amount of games
            score = new int[gamesToPlay];//set array size to the amount of games to play
            printLev = args[0];//set args as the print level
            if (printLev.equalsIgnoreCase("verbose"))
            {//if user wants to see it all
                level = 1;
            }
            else if (printLev.equalsIgnoreCase("silent"))
            {//if user doesn't
                level = -1;
            }
            else
            {//goldilocks, if user wants to see a little
                level = 0;
            }
        }

        //declaration of necessary objects
        Pile [] board;
        Card tempCard;
        Deck deck;

        //declaration of counters
        int count = 0;
        int steps = 0;
        int wins, losses;
        wins = 0;
        losses = 0;
        for (int j = 0; j < gamesToPlay; j++)
        {//for as many games are played
            //initialize the boards and card for new games
            board = new Pile[13];
            tempCard = new Card();

            for (int i = 0; i < board.length; i++)
            {//initialize all of boards piles
                board[i] = new Pile();
            }
            
            //initialize deck and shuffle
            deck = new Deck();
            deck.shuffle();

            for (int i = 0; i < 52; i++)
            {//deal a card to each pile until deck is run out
                board[i % 13].addCardFaceDown(deck.dealCard());//i % 13 puts in deck 1-4
            }

            if (level != -1)
            {//if not silent
                for (int i = 0; i < 13; i++)
                {//for amount of piles
                    System.out.println((i+1) + " o'clock: " + board[i].toString());//print the toString of pile;
                }
            }

            for (int i = 0; i < 13; i++)
            {//for each pile
                if (board[i].getNumberOfFaceDown() > 0)
                {//if card is face down iterate score
                    score[wins + losses]++;
                }
            }
            
            if (level != -1)
            {//if not silent
                System.out.println("Score: " + score);//print score
            }

            count = 0;
            do
            {//loop until king deck is run out of face down cards
                if (count == 0)
                {//for first run to remove from king deck
                    tempCard = board[12].removeCard();//remove top card
                    count++;//get out of first iteration
                }
                else
                {//remove the card from the previously placed in deck
                    tempCard = board[tempCard.getValue() - 1].removeCard();
                }

                board[tempCard.getValue() - 1].addCardFaceUp(tempCard);//add card to top deck
                if (level == 1)
                {//if verbose
                    System.out.println("////////NEW TURN////////");//structure
                    System.out.println("TEMP CARD: " + tempCard);//print temp card
                    for (int i = 0; i < 13; i++)
                    {//for amoount of piles
                        System.out.println((i+1) + " o'clock: " + board[i].toString());//print the pile
                    }
                }
            }
            while (board[12].getNumberOfFaceUp() < 4);
            score[wins + losses] = 0;//reset
            for (int i = 0; i < 13; i++)
            {//for amount of piles
                if (board[i].getNumberOfFaceDown() > 0)
                {//add to score if it has a face down card
                    score[wins + losses]++;
                }
            }

            if (level != -1)
            {//if not silent
                System.out.println("Score: " + score[wins + losses]);//print score
            }
            if (score[wins + losses] == 0)
            {//if the score is a win
                if (level != -1)
                {//if not silent
                    System.out.println("You win!");
                }
                wins++;//iterate wins
            }
            else
            {
                if (level != -1)
                {//if not silent
                    System.out.println("Game over.");
                }
                losses++;//iterate losses
            }
            if (level != -1)
            {//if not silent
                System.out.println("Wins: " + wins + "\nLosses: " + losses);//print out both amounts
            }

        }
        System.out.println("Games played: " + (wins + losses));//print amount of games
        for (int i = 0; i < score.length; i++)
        {//for amount of games
            System.out.println("Score #" + (i + 1) + ": " + score[i]);//print scores
        }
        //note: the percentages and scores array instructions made no sense & was poorly written
        //print percentages of wins and losses i guess
        System.out.println("% of games won: " + (((double)wins / (double)(wins + losses)) * 100.0) + "%");
        System.out.println("% of games lost: " + (((double)losses / (double)(wins + losses)) * 100.0) + "%");

    }
}
