/**
 * This class is the MyString class, which is a replica of some of the major classes of the String class.
 * 
 * MyString.java
 * 
 * @author Andrew Wilson
 * @version 3/25/2017
 */
public class MyString
{
    //private fields 
    private String myStr;//string object that goes into MyString
    private char[ ] charArr;//character array that goes into MyString
    
    /**
     * Constructor that takes in a String object and sets the fields of MyString to the appropriate values
     * @param String str - the string to be put in the MyString object
     * @return MyString object - instance of MyString
     */
    public MyString(String str)
    {
        myStr = new String(str);//set string to user input
        charArr = str.toCharArray( );//convert user string to character array
    }

    /**
     * Constructor that takes in a character array and sets the fields of MyString to the appropriate values
     * @param char [] inSequence - the array of characters to be put in the MyString object
     * @return MyString object - instance of MyString
     */
    public MyString(char[ ] inSequence)
    {
        myStr = new String(inSequence);//sets the string to the character array
        this.charArr = new char[inSequence.length];//sets the character array length to the incoming character array length
        for(int k= 0; k < charArr.length; k++)
        {//for the length of the array
            this.charArr[k] = inSequence[k];//set each character index in the array to a new value
        }
    }

    /**
     * Constructor that takes in a MyString object and sets the fields of MyString to the appropriate values
     * @param MyString other - the MyString object to be cloned to be put in the MyString object
     * @return MyString object - instance of MyString
     */
    public MyString(MyString other)
    {
        this.charArr = other.charArr;//shallow copy the array
        this.myStr = new String(other.myStr);//deep copy the string
    }

    /**
     * charAt method - returns the character at the specified position
     * @param int index - the position of the wanted character
     * @return char - character at position (index)
     */
    public char charAt(int index)
    {
        return charArr[index];//returns the character at position index
    }

    /**
     * compareTo method - lexographically compares the two MyString character values and returns which string is considered greater, if the first string is greater, return 1, if the second string is greater, return -1, if they're equal, return 0
     * @param MyString other - an instance of the my string object that will be compared to the first object
     * @return int - the value of comparison 
     */
    public int compareTo(MyString other)
    {
        if (this.charArr.length > other.charArr.length)
        {//if first array length is greater
            return 1;
        }
        else if (this.charArr.length < other.charArr.length)
        {//if second array length is greater
            return -1;
        }
        for (int i = 0; i < this.charArr.length; i++)
        {//for length of character array
            for (int j = 0; j < other.charArr.length; j++)
            {//for length of other character array
                if (i == j && this.charArr[i] > other.charArr[j])
                {//if i and j are the same, and if first array character is greater than the second
                    return 1;  
                }
                if (i == j && this.charArr[i] < other.charArr[j])
                {//if i and j are the same, and if firt array character is less than the other
                    return -1;
                }
            }
        }
        return 0;
    }

    /**
     * compareToIgnoreCase - compares the two MyStrings lexographically by first making both of them lower case, then 
     * @param MyString other - an instance of the MyString object that will be compared to the first object
     * @return int - the value of comparison
     */
    public int compareToIgnoreCase(MyString other)
    {
        return this.toLowerCase().compareTo(other.toLowerCase());//return this mystring lowercase comparedTo the other mystring lowercase
    }

    /**
     * concat - concatenates the two strings, appending the second string onto the end of the first
     * @param MyString other - an instance of the MyString object that is concatenated onto the end
     * @return MyString - the new MyString object of both put together
     */
    public MyString concat(MyString other)
    {
        char [] arr = new char[this.charArr.length + other.charArr.length + 1];//make new array length of both combined
        int count = 0;//counter variable
        for (int i = 0; i < this.charArr.length; i++)
        {//for length of first array
            arr[i] = this.charArr[i];//set new array character to first array
        }
        for (int i = this.charArr.length + 1; i < arr.length; i++)
        {//for length of rest of new array
            arr[i] = other.charArr[count];//set new array character to second array
            count++;//iterate
        }
        return new MyString(arr);//return new concatenated string
    }

    /**
     * endsWith - checks if the MyString ends with the suffix
     * @param MyString suffix - the phrased that's being checked against the end of the first MyString
     * @return boolean - whether or not the phrase ends with the suffix
     */
    public boolean endsWith(MyString suffix)
    {
        int count = 0;//counter variable
        for (int i = this.charArr.length - suffix.charArr.length; i < this.charArr.length; i++)
        {//for length from suffix to end of array
            if (this.charArr[i] != suffix.charArr[count])
            {//if it's not equal, return false
                return false;
            }
            count++;
        }
        return true;//otherwise return true
    }

    /**
     * equals - checks whether the two MyStrings are equivalent or not
     * @param MyString other - the instance of a MyString object that is being checked for equivalence
     * @return boolean - whether or not the phrases are the same
     */
    public boolean equals(MyString other)
    {
        if (this.charArr.length != other.charArr.length)
        {//if they're not the same length return false
            return false;
        }
        for (int i = 0; i < this.charArr.length; i++)
        {//for length of array
            if (this.charArr[i] != other.charArr[i])
            {//if it's not equal, return false
                return false;
            }
        }
        return true;//otherwise return true
    }

    /**
     * equalsIgnoreCase - checks whether the two MyStrings are equivalent not accounting for case - sends to .toLowerCase then to equals
     * @param MyString other - the instance of a MyString object that is being checked for equivalence
     * @return boolean - whether or not the phrases are the same
     */
    public boolean equalsIgnoreCase(MyString other)
    {
        return this.toLowerCase().equals(other.toLowerCase());//return the equality of both MyStrings to lowercase
    }

    /**
     * indexOf - returns the index of the character given by user
     * @param char findMe - the character to be found in the MyString
     * @return int - the index position of the character
     */
    public int indexOf(char findMe)
    {
        for (int i = 0; i < this.charArr.length; i++)
        {//for length of array
            if (this.charArr[i] == findMe)
            {//if it's the character return the index
                return i;
            }
        }
        return -1;//otherwise return -1
    }

    /**
     * indexOf - overloaded - returns the index of the character given by the user starting after the index given by the user
     * @param char findMe - the character to be found in the MyString
     * @param int fromIndex - the index to start searching from 
     * @return int - the indexed position of the character
     */
    public int indexOf(char findMe,  int fromIndex)
    {
        for (int i = fromIndex; i < this.charArr.length; i++)
        {//for length of array, starting at first index
            if (this.charArr[i] == findMe)
            {//if it's the character, return the index
                return i;
            }
        }
        return -1;//otherwise return -1
    }

    /**
     * lastIndexOf - finds the final index of a character given by the user
     * @param char findMe - the character to be found in the MyString
     * @return int - the indexed position of the character
     */
    public int lastIndexOf(char findMe)
    {
        for (int i = this.charArr.length - 1; i >= 0; i--)
        {//starting at end of array count down
            if (this.charArr[i] == findMe)
            {//if it's the character, return the index
                return i;
            }
        }
        return -1;//otherwise return -1
    }

    /**
     * length - returns the length of the MyString phrase 
     * @return int - the length of the MyString phrase
     */
    public int length( )
    {
        return this.charArr.length;//return length of array
    }

    /**
     * replace - replaces a certain character in the MyString with another
     * @param char oldChar - the character that will be replaced with newChar
     * @param char newChar - the character replacing oldChar
     * @return MyString - the new string with the characters changed
     */
    public MyString replace(char oldChar, char newChar)
    {
        char [] newArr = new char[this.charArr.length];//new array of char
        for (int i = 0; i < this.charArr.length; i++)
        {//for length of array
            newArr[i] = this.charArr[i];//set array to new one
            if (newArr[i] == oldChar)
            {//if the character is the to be replaced one
                newArr[i] = newChar;//replace
            }
        }
        return new MyString(newArr);
    }

    /**
     * startsWithString - checks if the MyString begins with the user provided prefix
     * @param MyString prefix - the prefix to be checked for at the beginning
     * @return boolean - whether or not the MyString starts with the prefix
     */
    public boolean startsWithString(MyString prefix)
    {
        for (int i = 0; i < prefix.charArr.length; i++)
        {//for length of array
            if (this.charArr[i] != prefix.charArr[i])
            {//if character is not equal, return false
                return false;
            }
        }
        return true;//otherwise return true
    }

    /**
     * substring - returns a new MyString in the range from the user given starting index to the end of the MyString
     * @param int beginIndex - the start of the new substring
     * @return MyString - the new instance that is the shorter substring
     */
    public MyString substring(int beginIndex)
    {
        char [] newArr = new char[this.charArr.length - beginIndex];//for length of substring
        int count = 0;//counter variable
        for (int i = beginIndex; i < this.charArr.length; i++)
        {//for length of array
            newArr[count] = this.charArr[i];//set new array to substring
            count++;//iterate
        }
        return new MyString(newArr);//return new array 
    }

    /**
     * substring - overloaded - returns a new MyString in the random from the user given starting index to the user given ending index
     * @param int beginIndex - the starting index of the substring
     * @param int endIndex - the ending index of the substring
     * @return 
     */
    public MyString substring(int beginIndex, int endIndex)
    {
        char [] newArr = new char[endIndex - beginIndex];//for length of substring
        int count = 0;//counter variable
        for (int i = beginIndex; i < endIndex; i++)
        {//for length from index to index
            newArr[count] = this.charArr[i];//set new array to substring
            count++;//iterate
        }
        return new MyString(newArr);//return new array
    }

    /**
     * toUpperCase - converts all of the characters in the MyString to uppercase letters
     * @return MyString - a new instance of a completely uppercase MyString
     */
    public MyString toUpperCase( )
    {
        char [] newArr = new char[this.charArr.length];//for length of array create new
        for (int i = 0; i < this.charArr.length; i++)
        {//for length of array
            newArr[i] = this.charArr[i];
        }
        for (int i = 0; i < newArr.length; i++)
        {//for length of new array
            if (newArr[i] > 96 && newArr[i] < 123)
            {//if it's lowercase, subtracted 32 makes uppercase
                newArr[i] -= 32;
            }
        }
        return new MyString(newArr);
    }

    /**
     * toLowerCase - converts all of the characters in the MyString to lowercase letters
     * @return MyString - a new instance of a completely lowercase MyString
     */
    public MyString toLowerCase()
    {
        char [] newArr = new char[this.charArr.length];//for length of array create new
        for (int i = 0; i < this.charArr.length; i++)
        {//for length of array
            newArr[i] = this.charArr[i];
        }
        for (int i = 0; i < newArr.length; i++)
        {//for length of new array
            if (newArr[i] > 64 && newArr[i] < 91)
            {//if it's lowercase, adding 32 makes lowercase
                newArr[i] += 32;
            }
        }
        return new MyString(newArr);
    }

    /**
     * toString - returns a String object to be printed
     * @return String - the new String object to be printed
     */
    public String toString( )
    {
        return new String(charArr);//return string object of character array
    }


}
