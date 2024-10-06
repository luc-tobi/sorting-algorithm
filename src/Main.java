package src;
import java.util.Arrays;

public class Main
{
     public static void main(String[] args)
     {
         int[] numbers1 = {};
         System.out.println("Array beginning:");
         System.out.println(Arrays.toString(numbers1));

         for (int i = 0; i < numbers1.length - 1; i++)
         {
             int num1 = numbers1[i];
             System.out.println(num1);
             int num2 = numbers1[i + 1];
             System.out.println(num2);

             if (num1 > num2)
             {
                 int num3 = numbers1[i];
                 numbers1[i] = numbers1[i + 1];
                 numbers1[i + 1] = num3;
                 System.out.println("Array swapped:");
                 System.out.println(Arrays.toString(numbers1));
             }
         }
     }
}
