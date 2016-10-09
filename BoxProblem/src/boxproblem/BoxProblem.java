package boxproblem;
import java.util.*;
import javax.swing.*;

public class BoxProblem {

    
 
    public static void main(String[] args) {
         String input1, input2;
        double a = 0, b = 0;
        
        while (a != -1){
        input1 = JOptionPane.showInputDialog("Enter the with of one corridor: ");
        a = Double.parseDouble(input1);
        if(a == -1){
            System.exit(0);
        }
        input2 = JOptionPane.showInputDialog("Enter the width of the other corridor: ");
        b = Double.parseDouble(input2);
              
        length(a,b);
        
    } } 
        public static double length(double w, double w2){
            double h = .001;
            double l = 0;
            double l2 = 0;
            double chess = ((w/Math.sin(0))+ (w2/Math.cos(0)));
            for(double i = 0; i<(Math.PI/2); i+= 0.001){
                l = ((w/Math.sin(i)) + w2/Math.cos(i));
                    if(l<chess){
                    chess  = l;
                }
            }
            return chess;
        }
   }
//http://www.had2know.com/academics/rectangular-box-maximum-volume.html