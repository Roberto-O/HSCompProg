package primedrome;
import javax.swing.*;
import java.util.*;

public class Primedrome {

 public static void main(String[] args) {
	   
    String oneNum;
    String teste;
    int firNum;
    int test;
 
    oneNum = JOptionPane.showInputDialog("Enter a positive integer greater than 1: ");
    firNum = Integer.parseInt(oneNum);
   
    JOptionPane.showMessageDialog(null,"The number you entered is: " + firNum, "Primedrome", JOptionPane.INFORMATION_MESSAGE);
    
    primeNum(firNum);

   }
    
public static int primeNum(int numberr){      
boolean isPrime = true;
int sqrtNum;
int divisor = 3;
int firNum = numberr;

String oneNum;
String teste;

String paline;
String palin;

int test;
    
if (firNum == -1){
        System.exit(0);
}else{
    while (firNum != -1){
        if (firNum <= 1){     
            JOptionPane.showMessageDialog(null,"You must enter an integer greater than 1. " + "Execute program again", "Primedrome", JOptionPane.INFORMATION_MESSAGE);
        }else if (firNum == 2){              
            JOptionPane.showMessageDialog(null,"It Is a Prime Number\n", "Primedrome", JOptionPane.INFORMATION_MESSAGE);
            paline = JOptionPane.showInputDialog("Do you want to find out if its Palindrome?");
                if(paline.equals("yes") || paline.equals("YES") || paline.equals("Yes")){
                    isPalindrome(firNum);
                } else if(paline.equals("no") || paline.equals("NO") || paline.equals("No")){
                    System.exit(0);
                }else{
                    System.exit(0);
                }
        }else if (firNum % 2 == 0){  
            JOptionPane.showMessageDialog(null,"It Is Not a Prime Number\n", "Primedrome", JOptionPane.INFORMATION_MESSAGE);
            paline = JOptionPane.showInputDialog("Do you want to find out if its Palindrome?");
                if(paline.equals("yes")){
                    isPalindrome(firNum);
                } else if(paline.equals("no")){
                    System.exit(0);
                }else{
                    System.exit(0);
                }
        }else{
            sqrtNum = (int)(Math.pow(firNum,0.5));
            /*while (divisor <= sqrtNum){
                if (number % divisor == 0){
                    System.out.println("It Is NOT a Prime Number\n");
                    isPrime = false;  
                }else
                    divisor = divisor + 2;    
                }//end calc while*/
        if (isPrime)
            JOptionPane.showMessageDialog(null,"It Is a Prime Number\n", "Primedrome", JOptionPane.INFORMATION_MESSAGE);
            paline = JOptionPane.showInputDialog("Do you want to find out if its Palindrome?");
                if(paline.equals("yes") || paline.equals("YES") || paline.equals("Yes")){
                    isPalindrome(firNum);
                } else if(paline.equals("no") || paline.equals("NO") || paline.equals("No")){
                    System.exit(0);
                }else{
                    System.exit(0);
                }
        }//end calc else
        oneNum = JOptionPane.showInputDialog("Enter a positive integer greater than 1: ");
        firNum = Integer.parseInt(oneNum);
        
        JOptionPane.showMessageDialog(null,"The number you entered is: " + firNum, "Primedrome", JOptionPane.INFORMATION_MESSAGE);
        }//end loop while
     }//end loop else
    return firNum;
  }//end method

    public static int isPalindrome(int number) {
	int x = number;
        
        if (x < 0){
           //System.out.print("It is not Palindrome\n");
           //return x; //not
            System.exit(0);
            return x;
        }else{
            int div = 1;
            while (x / div >= 10){
                div *= 10;
            }
            int left = x / div;
            int right = x % 10;
            if (left != right){
                //System.out.print("It is not Palindrome\n");
                JOptionPane.showMessageDialog(null,"It is not Palindrome", "Primedrome", JOptionPane.INFORMATION_MESSAGE);
                return x; //not
            }
            x = (x % div) / 10;
            div /= 100;
            }
        //System.out.print("It is Palindrome\n");
        JOptionPane.showMessageDialog(null,"It is Palindrome", "Primedrome", JOptionPane.INFORMATION_MESSAGE);
        return x; //true
    }
    
}