
/**
 * handles data for the bowler
 * 
 * @author Andrew Wilson
 * @version 1.0
 */
public class Bowler
{
    private String name;
    private int age;
    private int score1;
    private int score2;
    private int score3;
    /**
     * Default constructor for objects of class Bowler
     * 
     * @param none
     */
    public Bowler()
    {
        name = null;
        age = 0;
        score1 = 0;
        score2 = 0;
        score3 = 0;
    }
    
    /**
     * Overload constructor for objects of class Bowler with user input
     * 
     * @param String name - bowlers name
     * @param int age - bowlers age
     * @param int score1 - bowlers first score
     * @param int score2 - bowlers second score
     * @param int score3 - bowlers third score
     * 
     */
    public Bowler(String n, int a, int s1, int s2, int s3)
    {
        name = n;
        age = a;
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }
    
    /**
     * Calculates average for bowlers scores
     * 
     * @return double average
     */
    public double calcAverage()
    {
        return (double)(score1 + score2 + score3) / 3;
    }
    
    /**
     * gets bowlers name
     * 
     * @return String name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * gets bowlers Score 1
     * 
     * @return int score1
     */
    public int getScore1()
    {
        return score1;
    }
    
    /**
     * gets bowlers Score 2
     * 
     * @return int score2
     */
    public int getScore2()
    {
        return score2;
    }
    
    /**
     * gets bowlers Score 3
     * 
     * @return int score3
     */
    public int getScore3()
    {
        return score3;
    }
    
    /**
     * set bowlers Score 1
     * 
     * @param int s1 - score 1 replacement
     */
    public void setScore1(int s1)
    {
        if (s1 >= 0 && s1 <= 300)
        {//as long as score is in range
            score1 = s1;
        }
    }
    
    /**
     * set bowlers Score 2
     * 
     * @param int s2 - score 2 replacement
     */
    public void setScore2(int s2)
    {
        if (s2 >= 0 && s2 <= 300)
        {//as long as score is in range
            score2 = s2;
        }
    }
    
    /**
     * set bowlers Score 3
     * 
     * @param int s3 - score 3 replacement
     */
    public void setScore3(int s3)
    {
        if (s3 >= 0 && s3 <= 300)
        {//as long as score is in range
            score3 = s3;
        }
    }
}
