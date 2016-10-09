package gradetest;
import java.util.*;
import java.io.*;

public class GradeTest {

public static void main(String[]args)throws FileNotFoundException{ 
     String testanswers;
     String studentsAns;
     String inputLine;
     int blankspace;
     int score;
     int i;
     
     String[] students_ID = new String [10];
     char [] scoregrade = new char[10];

     Scanner inFile = new Scanner(new FileReader("H:\\AnswerKey.txt"));
       System.out.println("The Grading data input is: ");
     testanswers = inFile.nextLine(); //gets input
       System.out.println("Answers: " + testanswers); //prints answer first line

     int index = 0;
     while (inFile.hasNext() && index < 10){ //creates loop to loop for 10 people
        inputLine = inFile.nextLine();        
        blankspace = inputLine.indexOf(' ');         

        studentsAns = inputLine.substring(blankspace + 1, inputLine.length()); //gets answers
        students_ID[index] = studentsAns; //gets id number

        score = 0; 
        for(i = 0; i < studentsAns.length(); i++) //calculates score
          if (studentsAns.charAt(i) !=' ')
            if (studentsAns.charAt(i)==testanswers.charAt(i))
                score = score + 2;
            else
                score = score -1;
          else
                score = score;

       scoregrade[index] = testgrade(score); 
       System.out.println(scoregrade[index] + inputLine);
  }
      System.out.println();
}
   public static char testgrade(int score){
         char grade = ' ';
         
         if (score*100/40>=90)
            System.out.print(" A ");
         else if(score *100/40>=80)
            System.out.print( " B ");
         else if (score*100/40>=70)
            System.out.print( " C ");
         else if (score*100/40>=60)
            System.out.print( " D ");
         else
            System.out.print( " F ");
       
         return grade;
   }
}