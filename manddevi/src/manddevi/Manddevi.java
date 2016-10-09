package manddevi;
import java.util.*;
import javax.swing.*;
import java.text.*;

public class Manddevi {
  
public static void main(String args[]){
 String a, outstr;
 a = JOptionPane.showInputDialog("How many numbers?: ");
 int count = Integer.parseInt(a);
 double avg, deviation; 
 double[]numbers = new double[count];
 int counter = 1;
 for(int x = 0; x < count; x++){
   if(x<0){
        System.exit(0);
   }else{
        a = JOptionPane.showInputDialog(counter + ") Enter your number: ");
        counter++;
  }
   numbers[x]= Double.parseDouble(a);
}

avg = CalculateDeviation.average(numbers);
deviation=CalculateDeviation.standardDeviation(numbers,avg);
DecimalFormat dollars = new DecimalFormat("0.000");
deviation = Double.parseDouble(dollars.format(deviation));

outstr = "The mean is: " + avg + "\n" + "the standard deviation is: " + deviation;
JOptionPane.showMessageDialog(null, outstr, "title", JOptionPane.INFORMATION_MESSAGE);

  }
}
