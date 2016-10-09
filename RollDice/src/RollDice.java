//created by @Roberto 
import java.util.*;
import javax.swing.*;

public class RollDice
{
    public static RollDie Roll = new RollDie();
    public static void main(String[] args)
    {
        
        int num1;
        int num2;
        
        String firstNum;
        String secondNum;
        String output;
        String output2;
        
        firstNum = JOptionPane.showInputDialog("Enter a sum you would like the First pair of dice to add up and press OK. (2-12) ");
        num1 = Integer.parseInt(firstNum);
        
        secondNum = JOptionPane.showInputDialog("Enter a sum you would like the Second pair of dice to add up and press OK. (2-12) ");
        num2= Integer.parseInt(secondNum);
        
        if(num1 <= 1 || num2 <= 1){
            System.out.println("Exiting");
            System.exit(0);     
        }else if (num1 >= 2 && num2 >=13 || num1 >=13 && num2 >=2){
            System.out.println("Invalid Numbers \nNow Exiting");
            System.exit(0);
        }else{
            while(num1 <= 12 && num1 >= 2 || num2 >= 2 && num2 <= 12){
                output = "The number of times the dice are " + "rolled to get the sum " + num1 + " = " + rollDice(num1);
                output2 = "The number of times the dice are " + "rolled to get the sum " + num2 + " = " + rollDice(num2);
                JOptionPane.showMessageDialog(null, output + "\n" + output2, "Answer", JOptionPane.INFORMATION_MESSAGE);
                
        
                firstNum = JOptionPane.showInputDialog("Enter a sum you would like the First pair of dice to add up and press OK. (1-12) ");
                num1 = Integer.parseInt(firstNum);
        
                secondNum = JOptionPane.showInputDialog("Enter a sum you would like the Second pair of dice to add up and press OK. (1-12) ");
                num2= Integer.parseInt(secondNum);
                    if(num1 <= 1 || num2 <= 1){
                        System.out.println("Exiting");
                        System.exit(0);     
                    }else if (num1 >= 2 && num2 >=13 || num1 >=13 && num2 >=2){
                        System.out.println("Invalid Numbers \nNow Exiting");
                        System.exit(0);
                }//end else if
            }//end while
        }//end else
        System.out.println("Invalid Numbers \nNow Exiting");
        System.exit(0);
    }//end main

    public static int rollDice(int num){
        int die1;
        int die2;
        int sum;
        int rollCount = 0;

        do
        {
            die1 = Roll.roll();
            die1 = Roll.getNum();
            die2 = Roll.roll();
            die2 = Roll.getNum();
            sum = die1 + die2;
            rollCount++;
        }
        while (sum != num);

        return rollCount;
    }
    
}
