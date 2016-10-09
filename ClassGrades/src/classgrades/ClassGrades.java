package classgrades;
import java.util.*;
import javax.swing.*;

public class ClassGrades {
   public static String[] names = new String [6];
   public static int [] scores = new int[6];
  static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
    //String[] names = new String [10];
    //int [] scores = new int[10];
    for(short i = 0; i < 5; i++){
      Exception exp = null;
      do {
        try{
          exp = null;
          String sname = JOptionPane.showInputDialog("Enter the name of the Student: ");
          names[i] = sname;
          String sscore = JOptionPane.showInputDialog("Enter the students test score: " + "");
          scores[i] = Integer.parseInt(sscore);
        }catch(Exception e){exp = e;}
      }while(names[i] == null || exp != null);
    }
    
    String winner = "";
    double winnerVotes = 0;
    double totalScore = 0;
    double average;
    int j;

    for (j = 0; j< scores.length; j++)
      totalScore += scores[j];
    if(scores.length != 0)
        average = totalScore / scores.length;
    else
        average = 0;
    
    
    
    System.out.println("---------------------------------------");
    System.out.println("Class Average: " + average); //*total score
    System.out.println("-------------------------------------------------");
    
    System.out.println("You guys scored lower than average, Work Harder! ");
    System.out.println("-------------------------------------------------");
    
    
    for (j = 0; j < names.length; j++){
      if (scores[j]<average){
        System.out.println(names[j] + " " + scores[j]);
        //JOptionPane.showMessageDialog(null, names[j] + " " + scores[j] , "title", JOptionPane.INFORMATION_MESSAGE);
        }//end if below avg
    }//end for
    
    System.out.println("----------------------------------------------------------");
    System.out.println("Good job, you guys scored higher than average. Keep It Up! ");
    System.out.println("----------------------------------------------------------");
    for(j=0; j<names.length; j++){
        if(scores[j]>average){
            System.out.println(names[j] + " " + scores[j]);
            //JOptionPane.showMessageDialog(null, names[j] + " " + scores[j] , "title", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    
    
    /*for(j=0; j<names.length; j++){
        System.out.println("same good");
        if(scores[j] == average){
            System.out.println(names[j] + " " + scores[j]);
        }
    }*/
    
  }//end main
}//end classgrades
