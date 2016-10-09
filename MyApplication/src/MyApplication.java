
package my.application;
import java.util.*;
import javax.swing.*;

public class MyApplication {
    
    public static void main(String[] args) {
        
        //Scanner scanner = new Scanner(System.in);
        //Scanner scanner2 = new Scanner(System.in);
        
        double firNum;
        double secNum;
        
        String firstNum;
        String secondNum;
        String output;
        
        firstNum = JOptionPane.showInputDialog("Enter your First number and press OK.");
        firNum = Double.parseDouble(firstNum);
        
        secondNum = JOptionPane.showInputDialog("Enter your Second number and press OK.");
        secNum= Double.parseDouble(secondNum);
        
        double answer = firNum + secNum;
        
        output = firNum + " + " + secNum + " = " + answer;
        
        JOptionPane.showMessageDialog(null, output, "Answer", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
    
}
