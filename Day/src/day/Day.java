package day;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Day {
  
public static void main(String[] args) {
    boolean run = true;
    
    while(run){
    String tester = JOptionPane.showInputDialog("What day is today? ");
        if(tester.equals("end")){
           run = false;
       }else{
           DayCon day = new DayCon(tester);
           day.printDay();
    
           JOptionPane.showMessageDialog(null,"\n" + "Return Day: " + day.returnDay() + "\n" + "Next Day: " 
           + day.returnNextDay() + "\n" + "Previous Day: " + day.returnPreviousDay() , "Days FTW", JOptionPane.INFORMATION_MESSAGE);
    
           String tester2 = JOptionPane.showInputDialog("Enter a number to add to today's date: ");
           int add = Integer.parseInt(tester2);
    
           JOptionPane.showMessageDialog(null, add + " days from now would be:"  + "\n" +  day.whatDayIs(add) , "Days FTW", JOptionPane.INFORMATION_MESSAGE);
      }
    }
  }   
}
