
/**
 * Carnival Simulator
 * 
 * @Andrew Wilson
 * @version 1.0
 * 
 * difficulties: This program was insanely difficult because the doc we had to copy code from had so many errors it took almost 30 minutes to debug, and the instructions were very unclear
 * 
 */
public class Carnival
{
    public static void main(String [] args)
    {
        GameBooth balloonDartToss = new GameBooth (2, "tiger plush", "sticker");
        GameBooth ringToss = new GameBooth (2, "bear keychain", "pencil");
        GameBooth breakAPlate = new GameBooth(1.5, "pig plush", "plastic dinosaur");
        Player Shonda = new Player(5); //$5 spending money
        Player Luis = new Player(3); //$3 spending money
        System.out.println("Shonda goes to Balloon Dart Toss. ");
        System.out.println(Shonda.play(balloonDartToss));
        System.out.println(Shonda.getMoney());
        System.out.println("Shonda has: " + Shonda.showPrizes());
        System.out.println("Luis goes to Ring Toss. ");
        System.out.println(Luis.play(ringToss));
        System.out.println(Luis.getMoney());
        System.out.println("Luis has: " + Luis.showPrizes());
        System.out.println("Shonda goes to Ring Toss. ");
        System.out.println(Shonda.play(ringToss));
        System.out.println("Shonda won: " + Shonda.showPrizes());    
        System.out.println(Shonda.getMoney());
        System.out.println("Luis goes to Break A Plate. ");
        System.out.println(Luis.play(breakAPlate));
        System.out.println("Luis won: " + Luis.showPrizes());
        System.out.println(Luis.getMoney());
        balloonDartToss.numPrizes();
        ringToss.numPrizes();
        breakAPlate.numPrizes();
    }
}
/**
Shonda goes to Balloon Dart Toss. 
prize won: sticker
money left: $3.0
Shonda has: sticker null
Luis goes to Ring Toss. 
prize won: pencil
money left: $1.0
Luis has: pencil null
Shonda goes to Ring Toss. 
prize won: pencil
Shonda won: pencil sticker null
money left: $1.0
Luis goes to Break A Plate. 
Sorry, not enough money to play.
Luis won: pencil null
money left: $1.0

 */
