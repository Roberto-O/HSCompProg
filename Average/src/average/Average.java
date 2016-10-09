package average;
import java.util.*;
import javax.swing.*;

public class Average {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String one, two, three, four, five;
        double x1, x2, x3, x4, x5;
        String test = "ok";
        while(!test.equals("end")){
          one = JOptionPane.showInputDialog("Enter five numbers: (1 of 5)");
            test = one;
                if(test.equals("end")){
                System.exit(0);
        }x1 = Integer.parseInt(one);//one
            
          two = JOptionPane.showInputDialog("Enter five numbers: (2 of 5)");
            test = two;
                if(test.equals("end")){
                System.exit(0);
        }x2 = Integer.parseInt(two); //two
        
            three = JOptionPane.showInputDialog("Enter five numbers: (3 of 5)");
            test = three;
                if(test.equals("end")){
                System.exit(0);
        }x3 = Integer.parseInt(three);//three
        
        four = JOptionPane.showInputDialog("Enter five numbers: (4 of 5)");
        test = four;
        if(test.equals("end")){
            System.exit(0);
        }x4 = Integer.parseInt(four);//four
        
        five = JOptionPane.showInputDialog("Enter five numbers: (5 of 5)");
        test = five;
        if(test.equals("end")){
            System.exit(0);
        }x5 = Integer.parseInt(five);//five
        
        
        JOptionPane.showMessageDialog(null,"The mean is: " + mean(x1, x2, x3, x4, x5) 
                + "\nthe Standard Deviation is: " + standardDeviation(x1, x2, x3, x4, x5) , "Mean & SD", JOptionPane.INFORMATION_MESSAGE);
    }}
    public static double mean(double x1 ,double x2 ,double x3 ,double x4 ,double x5){
        double one = x1;
        double two = x2;
        double three = x3;
        double four = x4;
        double five = x5;
        
        double average = (one + two + three + four + five) / 5;
        return average;
    }
    
    
    public static double standardDeviation(double x1 ,double x2 ,double x3 ,double x4 ,double x5){
        double one = x1;
        double two = x2;
        double three = x3;
        double four = x4;
        double five = x5;
        
        double x = (one + two + three + four + five) / 5;
        double un = one -  x;
        double deux = two - x;
        double trois = three - x;
        double quatre = four - x;
        double cinq = five - x;
        
        double uno = Math.pow(un, 2);
        double dos = Math.pow(deux, 2);
        double tres = Math.pow(trois, 2);
        double quatro = Math.pow(quatre, 2);
        double cinqo = Math.pow(cinq, 2);
        
        double StandDevi = Math.sqrt((uno + dos + tres + quatro + cinqo) / 5);
        return StandDevi;
    }
}
