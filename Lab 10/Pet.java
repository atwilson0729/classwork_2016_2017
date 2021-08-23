
/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pet
{
    private String name;
    private String type;
    private double weight;
    private String lastRabies;
    private String lastVisit;
    
    public Pet()
    {
        name = "";
        type = "";
        weight = 0;
        lastRabies = "";
        lastVisit = "";
    }
    
    public Pet(String nama, String petType, double wt, String rabies, String visit)
    {
        name = new String(nama);
        type = new String(petType);
        weight = wt;
        lastRabies = new String(rabies);
        lastVisit = new String(visit);
    }
    
    public String toString()
    {
        return ("Pet name: " + name + "\nPet type: " + type + "\nWeigth: " + weight + "\nLast rabies shot: " + lastRabies + "\nLast visit: " + lastVisit + "\n");
    }
}
