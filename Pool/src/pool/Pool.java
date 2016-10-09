package pool;
import java.util.*;
import javax.swing.*;

public class Pool {

    static Scanner console = new Scanner(System.in);
       
        public static void main(String[] args)
        {
               
            //SwimmingPool bigPool = new SwimmingPool();
            //SwimmingPool emptyPool = new SwimmingPool(55, 34, 6, 165, 0);
            //SwimmingPool tenPercentFullPool = new SwimmingPool(55, 34, 6, 165, 10);
            //SwimmingPool eightyPercentFullPool = new SwimmingPool(55, 34, 6, 165, 80);
            //SwimmingPool fullPool = new SwimmingPool(55, 34, 6, 165, 100);
              
            String test = JOptionPane.showInputDialog ("Please enter the length of the pool: ");
            double t1 = Double.parseDouble(test);
            
            String test2 = JOptionPane.showInputDialog("Please enter the width of the pool: ");
            double t2 = Double.parseDouble(test2);
            
            String test3 = JOptionPane.showInputDialog ("Please enter the depth: ");
            double t3 = Double.parseDouble(test3);
            
            String test4 = JOptionPane.showInputDialog("Please enter the fill rate: (gallons per min)");
            double t4 = Double.parseDouble(test4);
            
            String test5 = JOptionPane.showInputDialog("Please enter the drain rate: ");
            double t5 = Double.parseDouble(test5);
            
            SwimmingPool bigPool = new SwimmingPool(t1, t2, t3, t4, t5, 0);
                
            JOptionPane.showMessageDialog(null, "The Length of the pool is: " + String.format("%.2f", bigPool.getLength()) + "ft" 
            + "\n" + "The Width of the pool is:  " + String.format("%.2f", bigPool.getWidth()) + "ft" + 
            "\n" + "The Depth of the pool is:  " + String.format("%.2f", bigPool.getDepth()) + "ft"
            + "\n" + "The Fill rate is: " + String.format("%.2f", bigPool.getFillRate()) + " gal/min" + "\n" + 
            "The Drain rate is: " + String.format("%.2f", bigPool.getDrainRate()) + " gal/min" + "\n" + 
            "The Volume of the pool is: " + String.format("%.2f", bigPool.getVolume()) + "gal"
            , "Pools" ,JOptionPane.INFORMATION_MESSAGE );
       
            // /* 
            //SwimmingPool emptyPool = new SwimmingPool(t1, t2, t3, t4, t5, 0);
            //SwimmingPool fullPool = new SwimmingPool(55, 34, 6, 165, 100);
            
            String test6 = JOptionPane.showInputDialog ("Fill the pool from: _ %");
            int num1 = Integer.parseInt(test6);
            SwimmingPool in1 = new SwimmingPool(t1, t2, t3, t4, t5, num1);
            
            String test7 = JOptionPane.showInputDialog( num1 + "% " + "to: _ %");
            int num2 = Integer.parseInt(test7);
            SwimmingPool in2 = new SwimmingPool(t1, t2, t3, t4, t5, num2);
            
            double in1Toin2 = in1.timeToFill() - in2.timeToFill();
            //double drain = in1.timeToEmpty() - in2.timeToEmpty();
            //double in1Toin2 = in2.timeToEmpty() - in1.timeToEmpty(); 
            
            JOptionPane.showMessageDialog(null,"The time to fill the pool from " + num1 + "% to " + num2 + "% is about: " + String.format("%.2f", in1Toin2) + " hours", "Pools", JOptionPane.INFORMATION_MESSAGE); 
            //*/
           
        }
} // 10 5 | 50% 100% 
