package src;
import java.util.Arrays;

public class Main
{
    public static void main (String[] args)
     {
         int[] numbers1 = {22, 33, 10, 1, 5, 9};
         int range = numbers1.length;
         System.out.println("Your unsorted input array:");
         System.out.println(Arrays.toString(numbers1));
         boolean swap = true;

         while (swap)
         {

             swap =false;
             for (int i = 0; i < range -1; i++)
             {

                 int num1 = numbers1[i];
                 int num2 = numbers1[i + 1];

                 if (num1 > num2)
                 {
                     int num3 = numbers1[i];
                     numbers1[i] = numbers1[i + 1];
                     numbers1[i + 1] = num3;
                     swap = true;
                 }
             }
             if (swap == false)
             {
                 System.out.println("Your array ist sorted! Here is your array:");
                 System.out.println(Arrays.toString(numbers1));
             }
         }
     }
}
