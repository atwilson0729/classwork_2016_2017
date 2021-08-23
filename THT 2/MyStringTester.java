import org.junit.Assert;
import org.junit.Test;

public class MyStringTester
{
  MyString string = new MyString("hello, this is a test string.");
  MyString anotherString = new MyString("hello, this is a test string.");
  MyString capsString = new MyString("HELLO, THIS IS A TEST STRING.");
  
  @Test
  public void testCharAt()
  {
    Assert.assertEquals("Test charAt method.", 44L, this.string.charAt(5));
  }
  
  @Test
  public void testCompareTo()
  {
    Assert.assertEquals("Test compareTo method.", 0L, this.string.compareTo(this.anotherString));
  }
  
  @Test
  public void testCompareToIgnoreCase()
  {
    Assert.assertEquals("Test compareToIgnoreCase method.", 0L, this.string.compareToIgnoreCase(this.capsString));
  }
  
  @Test
  public void testConcat()
  {
    Assert.assertEquals("Test concat method.", "hello, this is a test string.hello, this is a test string.", this.string.concat(this.anotherString).toString());
  }
  
  @Test
  public void testEndsWith()
  {
    Assert.assertEquals("Test endsWith method.", Boolean.valueOf(true), Boolean.valueOf(this.string.endsWith(new MyString("."))));
  }
  
  @Test
  public void testEquals()
  {
    Assert.assertEquals("Test equals method.", Boolean.valueOf(true), Boolean.valueOf(this.string.equals(this.anotherString)));
  }
  
  @Test
  public void testEqualsIgnoreCase()
  {
    Assert.assertEquals("Test equalsIgnoreCase method.", Boolean.valueOf(true), Boolean.valueOf(this.string.equalsIgnoreCase(this.capsString)));
  }
  
  @Test
  public void testIndexOf()
  {
    Assert.assertEquals("Test indexOf method.", 4L, this.string.indexOf('o'));
  }
  
  @Test
  public void testIndexOfAfter()
  {
    Assert.assertEquals("Test indexOf after an index method.", 17L, this.string.indexOf('t', 10));
  }
  
  @Test
  public void testLastIndexOf()
  {
    Assert.assertEquals("Test lastIndexOf method.", 22L, this.string.lastIndexOf('s'));
  }
  
  @Test
  public void testLength()
  {
    Assert.assertEquals("Test length method.", 28L, this.string.length());
  }
  
  @Test
  public void testReplace()
  {
    Assert.assertEquals("Test replace method.", "hezlo, this is a test string.", this.string.replace('l', 'z').toString());
  }
  
  @Test
  public void testStartsWithString()
  {
    Assert.assertEquals("Test startsWithString method.", Boolean.valueOf(true), Boolean.valueOf(this.string.startsWithString(new MyString("hello"))));
  }
  
  @Test
  public void testSubstring()
  {
    Assert.assertEquals("Test substring method.", "string.", this.string.substring(22).toString());
  }
  
  @Test
  public void testSubstringBounded()
  {
    Assert.assertEquals("Test bounded substring method.", "this", this.string.substring(7, 10).toString());
  }
  
  @Test
  public void testToLowerCase()
  {
    Assert.assertEquals("Test toLowerCase method.", this.string.toString(), this.capsString.toLowerCase().toString());
  }
  
  @Test
  public void testToUpperCase()
  {
    Assert.assertEquals("Test toUpperCase method.", this.capsString.toString(), this.string.toUpperCase().toString());
  }
  
  @Test
  public void testToString()
  {
    Assert.assertEquals("Test toString method.", "hello, this is a test string.", this.string.toString());
  }
  
  @Test
  public void testReplaceAll()
  {
    Assert.assertEquals("Test replaceAll method.", "hello, this isn't a test string.", this.string.replaceAll(new MyString("is a"), new MyString("isn't a")).toString());
  }
  
  @Test
  public void testIndexOfStr()
  {
    Assert.assertEquals("Test indexOf string method.", 19L, this.string.indexOf(new MyString("st")));
  }
  
  @Test
  public void testIndexOfStrAfter()
  {
    Assert.assertEquals("Test indexOf string after method.", 22L, this.string.indexOf(new MyString("st"), 20));
  }
  
  @Test
  public void testContains()
  {
    Assert.assertEquals("Test contains method.", Boolean.valueOf(true), Boolean.valueOf(this.string.contains(new MyString("test"))));
  }
}
