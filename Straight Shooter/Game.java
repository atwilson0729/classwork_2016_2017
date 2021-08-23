
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    private int playerScore;
    private int compScore;
    
    public Game()
    {
        playerScore = 0;
        compScore = 0;
    }
    
    public void move()
    {
        Die [] playerDie = new Die[6];
        Die [] compDie = new Die[6];
        
        for (int i = 0; i < playerDie.length; i++)
        {
            playerDie[i] = new Die();
            compDie[i] = new Die();
            System.out.println("Player roll:\n" + playerDie[i].toString() + "\n\nComputer roll:\n" + compDie[i].toString());
        }
        updateScore(playerDie, compDie);
    }
    
    public void updateScore(Die [] player, Die [] comp)
    {
        //player update
        int [] playerSides = new int[6];
        for (int i = 0; i < playerSides.length; i++)
        {
            switch (player[i].getFace())
            {
                case 1:
                playerSides[0]++;
                break;
                case 2:
                playerSides[1]++;
                break;
                case 3:
                playerSides[2]++;
                break;
                case 4:
                playerSides[3]++;
                break;
                case 5:
                playerSides[4]++;
                break;
                case 6:
                playerSides[5]++;
                break;
            }
        }
        if (playerSides[0] == 3)
        {
            playerScore = 0;
        }
        else if (playerSides[0] != 0)
        {
            playerScore += 5;
        }
        else if (playerSides[0] != 0 && playerSides[1] != 0)
        {
            playerScore += 10;
        }
        else if (playerSides[0] != 0 && playerSides[1] != 0 && playerSides[2] != 0)
        {
            playerScore += 15;
        }
        else if (playerSides[0] != 0 && playerSides[1] != 0 && playerSides[2] != 0 && playerSides[3] != 0)
        {
            playerScore += 20;
        }
        else if (playerSides[0] != 0 && playerSides[1] != 0 && playerSides[2] != 0 && playerSides[3] != 0 && playerSides[4] != 0)
        {
            playerScore += 25;
        }
        else if (playerSides[0] != 0 && playerSides[1] != 0 && playerSides[2] != 0 && playerSides[3] != 0 && playerSides[4] != 0 && playerSides[5] != 0)
        {
            playerScore += 35;
        }
        
        
        //computer update
        int [] compSides = new int[6];
        for (int i = 0; i < compSides.length; i++)
        {
            switch (comp[i].getFace())
            {
                case 1:
                compSides[0]++;
                break;
                case 2:
                compSides[1]++;
                break;
                case 3:
                compSides[2]++;
                break;
                case 4:
                compSides[3]++;
                break;
                case 5:
                compSides[4]++;
                break;
                case 6:
                compSides[5]++;
                break;
            }
        }
        if (compSides[0] == 3)
        {
            compScore = 0;
        }
        else if (compSides[0] != 0)
        {
            compScore += 5;
        }
        else if (compSides[0] != 0 && compSides[1] != 0)
        {
            compScore += 10;
        }
        else if (compSides[0] != 0 && compSides[1] != 0 && compSides[2] != 0)
        {
            compScore += 15;
        }
        else if (compSides[0] != 0 && compSides[1] != 0 && compSides[2] != 0 && compSides[3] != 0)
        {
            compScore += 20;
        }
        else if (compSides[0] != 0 && compSides[1] != 0 && compSides[2] != 0 && compSides[3] != 0 && compSides[4] != 0)
        {
            compScore += 25;
        }
        else if (compSides[0] != 0 && compSides[1] != 0 && compSides[2] != 0 && compSides[3] != 0 && compSides[4] != 0 && compSides[5] != 0)
        {
            compScore += 35;
        }
    }
    
    public int checkEnd()
    {
        if (playerScore >= 100)
        {
            return 1;
        }
        else if (compScore >= 100)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    public int getPlayerScore()
    {
        return playerScore;
    }
    
    public int getCompScore()
    {
        return compScore;
    }
}
