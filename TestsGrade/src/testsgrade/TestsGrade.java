package testsgrade;
import java.util.*;
import java.io.*;
import javax.swing.*;
public class TestsGrade
 {
 // Static variables
 static double average, grade, sum;
 static int count;
 static double[] gradeArray;
 static String outputfileName, inputfileName, name, gradeLetter, outputStr;

 public static void main(String[] args) throws FileNotFoundException {
 // Asking user for the input and output file names.
inputfileName = ("H:\\testData.txt");
outputfileName = ("H:\\TestOutput.txt");
PrintWriter outFile = new PrintWriter(outputfileName);
 Scanner inFile = new Scanner(new FileReader(inputfileName));
 outFile.printf("%8s %8s %8s %8s %8s %8s %8s %8s %n", "Student", "Test1",
"Test2", "Test3", "Test4", "Test5", "Average", "Grade");
 double[] gradeArray = new double[5];
 System.out.println("   Name     Test1    Test2    Test3    Test4    Test5   Average     Grade");
 System.out.println("  ------    -----    -----    -----    -----    -----   -------     ------");
 
 
    while (inFile.hasNext()){
        name = inFile.next(); // Gets the name of the student
        sum = 0;
        count = 0;
            while (count != 5){
                grade = inFile.nextDouble();
                gradeArray[count] = grade;
                sum = sum + grade;
                count++;
    }
 
    calculateAverage();
    //System.out.printf outFile.printf
    System.out.printf("%8s %8.2f %8.2f %8.2f %8.2f %8.2f %8.2f %8s %n", name , gradeArray[0], gradeArray[1], gradeArray[2], gradeArray[3], 
            gradeArray[4], average, calculateGrade(average));
 }
    inFile.close();
    outFile.close();
 }
 public static void calculateAverage(){
    if (count != 0){
        average = sum / count;
    }else{
        average = 0;
  }
}
 
 public static String calculateGrade(double average){
 String gradeLetter = "";
    if (average >= 90 && average <= 100){
        gradeLetter = "A";
    }else if (average >= 80 && average <= 89.99){
        gradeLetter = "B";
    }else if (average >= 70 && average <= 79.99){
        gradeLetter = "C";
    }else if (average >= 60 && average <= 69.99){
        gradeLetter = "D";
    }else if (average >= 0 && average <= 59.99){
        gradeLetter = "F";
 }return gradeLetter;
 }
}
