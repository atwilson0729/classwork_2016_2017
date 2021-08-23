
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
import java.lang.*;
public class Driver
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(new File("clientdata.txt"));
        String readLine = new String();
        StringTokenizer str;

        Human [] human = new Human[5];
        String lastName = new String();
        String firstName = new String();
        String address = new String();
        int id;
        int numVisits;
        int numPets;
        double outBal;
        String petName = new String();
        double wt;
        Pet [] pet;
        String petType = new String();
        String lastRabies = new String();
        String lastVisit = new String();

        int count = 0;
        while (in.hasNext())
        {
            readLine = in.nextLine();
            str = new StringTokenizer(readLine, ",");
            lastName = str.nextToken();
            firstName = str.nextToken();
            address = str.nextToken();
            id = Integer.parseInt(str.nextToken());
            numVisits = Integer.parseInt(str.nextToken());
            outBal = Double.parseDouble(str.nextToken());
            numPets = Integer.parseInt(str.nextToken());
            pet = new Pet[numPets];
            for (int i = 0; i < numPets; i++)
            {
                readLine = in.nextLine();
                str = new StringTokenizer(readLine, ",");
                petName = str.nextToken();
                petType = str.nextToken();
                wt = Double.parseDouble(str.nextToken());
                lastRabies = str.nextToken();
                lastVisit = str.nextToken();
                
                pet[i] = new Pet(petName, petType, wt, lastRabies, lastVisit);
            }
            human[count] = new Human(lastName, firstName, address, id, numVisits, outBal, pet);
            count++;
        }
        
        
        for (int i = 0; i < human.length; i++)
        {
            System.out.println(human[i].toString());
        }
        
        System.out.println(human[1].equals(human[2]));
    }
}
