import java.util.Random;
public class Fraction
{
    private int num1;
    private int den1;  
    
    public Fraction()
    {
        num1 = 0;
        den1 = 0;
    }
    
    public Fraction(int numOne, int denOne)
    {
        num1 = numOne;
        den1 = denOne;
    }
        
    public Fraction simplify()
    {
        int newNum = 0;
        int newDen = 0;
        if (num1 < den1)
        {
            if (num1 % den1 == 0)
            {
                newNum = num1 / den1;
                newDen = 1;
            }
            else
            {
                for(int i = num1; i > 0; i--)
                {
                    if (num1 % i == 0 && den1 % i == 0)
                    {
                        newNum = num1 / i;
                        newDen = den1 / i;
                        break;
                    }
                }
            }
        }
        else
        {
            if (den1 % num1 == 0)
            {
                newNum = 1;
                newDen = den1 / num1;
            }
            else
            {
                for(int i = den1; i > 0; i--)
                {
                    if (num1 % i == 0 && den1 % i == 0)
                    {
                        newNum = num1 / i;
                        newDen = den1 / i;
                        break;
                    }
                }
            }
        }
        return new Fraction(newNum, newDen);
    }
    
    public Fraction add(Fraction other)
    {
        int newNum;
        int newDen;
        
        newNum = (this.num1 * other.den1) + (other.num1 * this.den1);
        newDen = this.den1 * other.den1;
        
        return new Fraction(newNum, newDen);
    }
    
    public Fraction subtract(Fraction other)
    {
        int newNum;
        int newDen;
        
        newNum = (this.num1 * other.den1) - (other.num1 * this.den1);
        newDen = this.den1 * other.den1;
        
        return new Fraction(newNum, newDen);
    }
    
    public Fraction multiply(Fraction other)
    {
        int num;
        int den;
        num = this.num1 * other.num1;
        den = this.den1 * other.den1;
        
        return new Fraction(num, den);
    }
    
    public Fraction divide(Fraction other)
    {
        int num;
        int den;
        num = this.num1 * other.den1;
        den = this.den1 * other.num1;
        
        return new Fraction(num, den);
    }
    
    public int compare(Fraction other)
    {
        double frac1;
        double frac2;
        frac1 = ((double)this.num1 / this.den1);
        frac2 = ((double)other.num1 / other.den1);
        if (frac1 > frac2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public boolean equals(Fraction other)
    {
        double frac1;
        double frac2;
        frac1 = ((double)this.num1 / this.den1);
        frac2 = ((double)other.num1 / other.den1);
        
        return frac1 == frac2;
    }
    
    public double toDec()
    {
        return ((double)num1 / den1);
    }
    
    public static Fraction randomFrac()
    {
        Random r = new Random();
        int n1 = r.nextInt(10) + 1;
        int n2 = r.nextInt(10) + 1;
        if (n1 > n2)
        {
            return new Fraction(n2, n1);
        }
        else
        {
            return new Fraction(n1, n2);
        }
    }
    
    public String toString()
    {
        return (num1 + "/" + den1);
    }
}
