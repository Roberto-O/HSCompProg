package mypalindrome;
import javax.swing.*;
import java.util.*;

public class MyPalindrome {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter an integer or text to see if its palindrome (-1 to exit): " );
        int inputz = input.nextInt();
        
        if( inputz == -1){
            System.exit(0);
        }else{
            while(inputz != -1){
        System.out.printf("Palindrome is: %s\n",isPalindrome(inputz));
        System.out.println( "Enter an integer or text to see if its palindrome (-1 to exit): " );
        inputz = input.nextInt();
            }
        }
    }
    
    public static boolean isPalindrome(int x) {
	if (x < 0){
           return false;
        }else{
        int div = 1;
	while (x / div >= 10){
            div *= 10;
        }
        //while (x < 0) 
        //{
            int left = x / div;
            int right = x % 10;
                if (left != right){
                return false;
                }
            x = (x % div) / 10;
            div /= 100;
           // }
        }
   return true;
    }
    
} 


