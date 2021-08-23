/**
 * This is a driver class that tests all methods of the MyString class
 * 
 * Driver.java
 * 
 * @author Andrew Wilson
 * @version 3/25/2017
 */
import java.util.Scanner;//import scanner class
public class Driver
{
    /**
     * No args main method that compiler runs
     * @param String [] args - array of arguments
     */
    public static void main(String [] args)
    {
        //Declaration of objects
        Scanner kb = new Scanner(System.in);//two scanners, one for ints, one for strings
        Scanner kb2 = new Scanner(System.in);
        String str = new String();//string for input
        MyString userIn;//multiple MyStrings for testing
        MyString tester;
        MyString equals;

        System.out.print("Enter your string: ");//get user input
        str = kb.nextLine();
        userIn = new MyString(str);//create new instance using String overload constructor

        //MyString(MyString other)
        equals = new MyString(userIn);//tests the overload constructor with MyString as param
        
        //charAt(int index)
        System.out.print("Enter the position of the character you'd like to check: ");//get user input for position
        int pos = kb2.nextInt();
        System.out.println("This is the character at " + pos + ": " + userIn.charAt(pos));//print character in position

        //compareTo(MyString anotherMyString)
        System.out.print("Enter the string you'd like to compare \"" + userIn.toString() + "\" to: ");//get user input for comparison string
        str = kb.nextLine();
        tester = new MyString(str);//create MyString object
        System.out.println("This is \"" + userIn + "\" compared to \"" + tester + "\": " + userIn.compareTo(tester));//tests comparison of two MyStrings

        //compareToIgnoreCase(MyString anotherMyString
        System.out.println("This is \"" + userIn + "\" compared to \"" + tester + "\" ignoring case: " + userIn.compareToIgnoreCase(tester));//print comparison of two MyStrings ignoring case

        //concat(MyString str)
        System.out.println("This is the string concatenated with '" + tester + "': " + userIn.concat(tester).toString());//print out concatenated MyStrings

        //endsWith(MyString suffix)
        MyString endCheck;//create new suffix
        System.out.print("Enter the suffix you want to check if the string ends with: ");//get user input
        str = kb.nextLine();
        endCheck = new MyString(str);
        System.out.println("This checks if \"" + userIn.toString() + "\" ends with \"" + endCheck.toString() + "\": " + userIn.endsWith(endCheck));//prints out whether it ends with other MyString

        //equals(MyString anotherMyString)
        System.out.println("This checks if " + tester + " is equal to " + userIn + ": " + userIn.equals(tester));//prints if MyStrings are equal

        //equalsIgnoreCase(MyString anotherMyString
        System.out.println("This checks if \"" + tester + "\" is equal to \"" + userIn + "\", Ignoring case: " + userIn.equalsIgnoreCase(tester));//prints if MyStrings are equal ignoring case

        //indexOf(char ch)
        System.out.print("Enter the character you'd like to find the index of: ");//get user input
        char ch = kb.next().charAt(0);//get character at 0
        System.out.println(ch + " is at position: " + userIn.indexOf(ch));//print out the index

        //indexOf(char ch, int fromIndex)
        System.out.println("This finds the index of a character starting at the position you enter.");//get user input for first
        System.out.print("Enter the character you'd like to find the index of: ");
        ch = kb.next().charAt(0);
        System.out.print("Enter the index you'd like to search from: ");//get user input for second
        pos = kb2.nextInt();
        System.out.println(ch + " is at position: " + userIn.indexOf(ch, pos));//prints out index

        //lastIndexOf(char ch)
        System.out.print("Enter the character you'd like to find the last index of: ");//get user input for ch
        ch = kb.next().charAt(0);
        System.out.println(ch + "'s last position is at: " + userIn.lastIndexOf(ch));//prints out last index

        //length()
        System.out.println("The length of your string is: " + userIn.length());//prints out length of String

        //replace(char oldChar, char newChar)
        System.out.print("Enter the character you'd like to replace: ");//get user input for character to be replaced
        ch = kb.next().charAt(0);
        System.out.print("Enter the character you'd like to replace " + ch + " with: ");//get user input for character replacing
        char newCh = kb.next().charAt(0);
        System.out.println("This is your string after replacing " + ch + " with " + newCh + ": " + userIn.replace(ch, newCh).toString());//prints out MyString with replaced letters

        //startsWithString(MyString prefix)
        MyString startCheck;//new object for prefix
        System.out.print("Enter the prefix you want to check if the string starts with: ");//get user input for prefix
        str = kb.nextLine();
        startCheck = new MyString(str);//create new object
        System.out.println("This checks if \"" + userIn.toString() + "\" starts with \"" + startCheck.toString() + "\": " + userIn.startsWithString(startCheck));//prints out whether it starts with prefix

        //substring(int beginIndex)
        System.out.print("This returns a substring from the position you want to start at, to the end of the string, enter the position: ");//get user input for position
        pos = kb.nextInt();
        System.out.println("This is the substring from " + pos + " to the end of your string: " + userIn.substring(pos));//prints out substring

        //substring(int beginIndex, int endIndex)
        System.out.println("This returns a substring from the position you want to start at, to the position you want to end at.");
        System.out.print("Enter the start position: ");//get user input for start index
        pos = kb.nextInt();
        System.out.print("Enter the end position: ");//get user input for end index
        int endPos = kb.nextInt();
        System.out.println("This is the substring from " + pos + " to " + endPos + ": " + userIn.substring(pos, endPos));//print out substring of set range
        
        //toUpperCase()
        System.out.println(userIn + " to upper case: " + userIn.toUpperCase().toString());//print out upper case version

        //toLowerCase
        System.out.println(userIn + " to lower case: " + userIn.toLowerCase().toString());//print out lower case version, also note toString is tested all throughout
    }
}
