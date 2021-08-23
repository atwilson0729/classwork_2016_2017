/*
 * Program: Book
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: January 20th, 2016
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program sets the title and author for books
 *What I learned: How to make my own classes
 *Difficulties: Reading the instructions
 */
import java.util.*;
import java.text.*;
public class testBook
{
    public static void main(String[] args)
    {
        //creates each book and prints it
        Book myBook1 = new Book("Alice in Wonderland", "Lewis Carroll");
        Book myBook2 = new Book();
        Book myBook3 = new Book("On the Highway", "Jen Jones");
        Book myBook4 = new Book(myBook3);
        System.out.println("" + myBook1);
        System.out.println("" + myBook3);
        myBook2.setTitle("Alphabet 123");
        myBook2.setAuthor("Sam Smith");
        System.out.println("" + myBook2);
        myBook3.setAuthor("Jennifer Jones");
        System.out.println("\n" + myBook3);
        System.out.print(myBook1.getAuthor() + " ");
        System.out.println(myBook1.getTitle());
        System.out.println(myBook4);
    }
}
/*Sample output
The secs of the book are
	 Title: Alice in Wonderland
	 Author: Lewis Carroll
The secs of the book are
	 Title: On the Highway
	 Author: Jen Jones
The secs of the book are
	 Title: Alphabet 123
	 Author: Sam Smith

The secs of the book are
	 Title: On the Highway
	 Author: Jennifer Jones
Lewis Carroll Alice in Wonderland
The secs of the book are
	 Title: On the Highway
	 Author: Jen Jones
 */