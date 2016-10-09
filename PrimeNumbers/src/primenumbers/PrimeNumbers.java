package primenumbers;
import java.util.*;
import javax.swing.*;

public class PrimeNumbers
{
   
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
	   
    String oneNum;
    String teste;
    int firNum;
    int test;
 
    oneNum = JOptionPane.showInputDialog("Enter a positive integer greater than 1: ");
    firNum = Integer.parseInt(oneNum);
   
    JOptionPane.showMessageDialog(null,"The number you entered is: " + firNum, "Prime Numbers", JOptionPane.INFORMATION_MESSAGE);
    
    primeNum(firNum);

   }
    
public static int primeNum(int numberr){      
boolean isPrime = true;
int sqrtNum;
int divisor = 3;
int firNum = numberr;

String oneNum;
    String teste;
    //int firNum;
    int test;
    
if (firNum == -1){
        System.exit(0);
}else{
    while (firNum != -1){
        if (firNum <= 1){     
            JOptionPane.showMessageDialog(null,"You must enter an integer greater than 1. " + "Execute program again", "Prime Numbers", JOptionPane.INFORMATION_MESSAGE);
        }else if (firNum == 2){              
            JOptionPane.showMessageDialog(null,"It IS a Prime Number\n", "Prime Numbers", JOptionPane.INFORMATION_MESSAGE);
        }else if (firNum % 2 == 0){  
            JOptionPane.showMessageDialog(null,"It Is NOT a Prime Number\n", "Prime Numbers", JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null,"It IS a Prime Number\n", "Prime Numbers", JOptionPane.INFORMATION_MESSAGE);
        }//end calc else
        oneNum = JOptionPane.showInputDialog("Enter a positive integer greater than 1: ");
        firNum = Integer.parseInt(oneNum);
        
        JOptionPane.showMessageDialog(null,"The number you entered is: " + firNum, "Prime Numbers", JOptionPane.INFORMATION_MESSAGE);
        }//end loop while
     }//end loop else
    return firNum;
  }//end method
}