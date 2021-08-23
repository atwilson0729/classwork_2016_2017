import java.util.Random;
public class ArrayWork
{
    public static void main(String [] args)
    {
        Random rand = new Random();
        int [] nums  = new int[10];
        int [] newArr = new int[10];
        
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = rand.nextInt(10) + 1;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i--)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i += 2)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++)
        {
            newArr[i] = nums[i];
            if (i != nums.length - 1 && i >= 4)
            {
                nums[i] = nums[i + 1];
            }
            else if (i == nums.length - 1)
            {
                nums[i] = 0;
            }
        }
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++)
        {
            newArr[i] = nums[i];
            if (i != nums.length - 1 && i >= 2)
            {
                nums[i] = nums[i + 1];
            }
            else if (i == nums.length - 1)
            {
                nums[i] = 0;
            }
        }
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int twice [] = new int[nums.length * 2];
        for (int i = 0; i < twice.length; i++)
        {
            if (i < nums.length)
            {
                twice[i] = nums[i];
            }
            else 
            {
                twice[i] = 0;
            }
        }
        for (int i = 0; i < twice.length; i++)
        {
            System.out.print(twice[i] + " ");
        }
        System.out.println();
    }
}
