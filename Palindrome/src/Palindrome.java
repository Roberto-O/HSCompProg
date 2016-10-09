import javax.swing.*;
import java.util.*;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter an integer or text to see if its palindrome (Type 'end' to end the program): " );
        String inputz = input.nextLine();
        
        if(inputz.equals("end")){
            System.exit(0);
        }else{
            while(!inputz.equals("end")){
        System.out.printf("Palindrome is: %s\n",isPalindrome(inputz));
        System.out.println( "Enter an integer or text to see if its palindrome (Type 'end' to end the program): " );
        inputz = input.nextLine();
        }
      }
    }

    public static boolean isPalindrome(String str)
    {
        int len = str.length();                       //Step 1
        int i, j;

        j = len - 1;                                  //Step 2

        for (i = 0; i <= (len - 1)/2; i++)            //Step 3
        {
            if (str.charAt(i) !=  str.charAt(j))      //Step 3.a
               return false;
            j--;                                      //Step 3.b
        }

        return true;                                  //Step 4
    }
}
