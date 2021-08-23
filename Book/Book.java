/*
 * Program: Book
 * Version: 1.0
 * Author: Andrew Wilson
 * Date written: January 20th, 2016
 * Compiler/ Platform: Java 1.8, Windows 
 *Description: This program sets the title and author for books
 *What I learned: How to create my own class
 *Difficulties: reading instructions
 */
import java.util.*;
import java.text.*;
public class Book
{
    private String title;
    private String author;
    public Book()
    {//method with no parameters
        title = null;
        author = null;
    }
    public Book(String initialTitle, String initialAuthor)
    {//method with title and author parameter
        title = initialTitle;
        author = initialAuthor;
    }
    public Book(Book b)
    {//copycat method
        title = b.title;
        author = b.author;
    }
    /** This method set the title of the book
     * @requires title
     */
    public void setTitle(String t)
    {
        title = t;
    }
    /** This method sets the author of the book
     * @requires author
     */
    public void setAuthor(String a)
    {
        author = a;
    }
    /** This method sets the title and the author of the book
     * @requires title
     * @requires author
     */
    public void setBoth(String t, String a)
    {
        title = t;
        author = a;
    }
    /** This method returns the title of the book
     * @requires title
     * @requires author
     */
    public String getTitle()
    {
        return title;
    }
    /** This method returns the author of the book
     * @requires title
     * @requires author
     */
    public String getAuthor()
    {
        return author;
    }
    /** This method returns the title and the author of the book
     * @requires title
     * @requires author
     */
    public String toString()
    {
        String str = "The secs of the book are";
        str += "\n\t Title: " + title;
        str += "\n\t Author: " + author;
        return str;
    }
}