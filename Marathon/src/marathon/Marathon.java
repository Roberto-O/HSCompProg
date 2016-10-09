package marathon;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.text.*;

public class Marathon {
public static void main(String[] args) throws FileNotFoundException, IOException {

    String filename = "H:\\run.txt"; //Here you must write the path to the file f.exp "//folder//file.txt"

    try{
    FileReader readConnectionToFile = new FileReader(filename); 
    BufferedReader reads = new BufferedReader(readConnectionToFile);
    Scanner scan = new Scanner(reads);

    String[][] temperatures = new String[5][8];
    int counter = 0;
    try{
        while(scan.hasNext() /*&& counter < 5*/){
            for(int i = 0; i < 5; i++){
                //counter = counter + 1;
                for(int m = 0; m < 8; m++){
                    temperatures[i][m] = scan.nextLine();
                }
            }
    }

            //for(int i = 0; i < 5; i++){
            System.out.println(temperatures[0][0] + "\nMiles each day: " + temperatures[0][1] + ", " + temperatures[0][2] 
                    + ", " + temperatures[0][3] + ", " + temperatures[0][4] 
                    + ", " + temperatures[0][5] + ", " + temperatures[0][6] + ", " + temperatures[0][7] 
                    + "\nTotal miles for the week: " + sum1(temperatures) + "\nThe average: " + arrAvg1(temperatures) +"\n");
            
            System.out.println(temperatures[1][0] + "\nMiles each day: " + temperatures[1][1] + ", " + temperatures[1][2] 
                    + ", " + temperatures[1][3] + ", " + temperatures[1][4] 
                    + ", " + temperatures[1][5] + ", " + temperatures[1][6] + ", " + temperatures[1][7]
                    + "\nTotal miles for the week: " + sum2(temperatures) + "\nThe average: " + arrAvg2(temperatures) +"\n");
            
            System.out.println(temperatures[2][0] + "\nMiles each day: " + temperatures[2][1] + ", " + temperatures[2][2] 
                    + ", " + temperatures[2][3] + ", " + temperatures[2][4] 
                    + ", " + temperatures[2][5] + ", " + temperatures[2][6] + ", " + temperatures[2][7]
                    + "\nTotal miles for the week: " + sum3(temperatures) + "\nThe average: " + arrAvg3(temperatures) +"\n");
            
            System.out.println(temperatures[3][0] + "\nMiles each day: " + temperatures[3][1] + ", " + temperatures[3][2] 
                    + ", " + temperatures[3][3] + ", " + temperatures[3][4] 
                    + ", " + temperatures[3][5] + ", " + temperatures[3][6] + ", " + temperatures[3][7]
                    + "\nTotal miles for the week: " + sum4(temperatures) + "\nThe average: " + arrAvg4(temperatures) +"\n");
            
            System.out.println(temperatures[4][0] + "\nMiles each day: " + temperatures[4][1] + ", " + temperatures[4][2] 
                    + ", " + temperatures[4][3] + ", " + temperatures[4][4] 
                    + ", " + temperatures[4][5] + ", " + temperatures[4][6] + ", " + temperatures[4][7]
                    + "\nTotal miles for the week: " + sum5(temperatures) + "\nThe average: " + arrAvg5(temperatures) +"\n");

            //}

    } catch(InputMismatchException e){
        System.out.println("Error converting number");
    }
    scan.close();
    reads.close();
    } catch (FileNotFoundException e){
        System.out.println("File not found" + filename);
    } catch (IOException e){
        System.out.println("IO-Error open/close of file" + filename);
    }

}

public static String sum1(String a[][]) {

    int f1 = Integer.parseInt(a[0][1]);
    int f2 = Integer.parseInt(a[0][2]);
    int f3 = Integer.parseInt(a[0][3]);
    int f4 = Integer.parseInt(a[0][4]);
    int f5 = Integer.parseInt(a[0][5]);
    int f6 = Integer.parseInt(a[0][6]);
    int f7 = Integer.parseInt(a[0][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
     
  return str1;
}

public static String sum2(String a[][]) {

    int f1 = Integer.parseInt(a[1][1]);
    int f2 = Integer.parseInt(a[1][2]);
    int f3 = Integer.parseInt(a[1][3]);
    int f4 = Integer.parseInt(a[1][4]);
    int f5 = Integer.parseInt(a[1][5]);
    int f6 = Integer.parseInt(a[1][6]);
    int f7 = Integer.parseInt(a[1][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
     
  return str1;
}

public static String sum3(String a[][]) {

    int f1 = Integer.parseInt(a[2][1]);
    int f2 = Integer.parseInt(a[2][2]);
    int f3 = Integer.parseInt(a[2][3]);
    int f4 = Integer.parseInt(a[2][4]);
    int f5 = Integer.parseInt(a[2][5]);
    int f6 = Integer.parseInt(a[2][6]);
    int f7 = Integer.parseInt(a[2][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
     
  return str1;
}

public static String sum4(String a[][]) {

    int f1 = Integer.parseInt(a[3][1]);
    int f2 = Integer.parseInt(a[3][2]);
    int f3 = Integer.parseInt(a[3][3]);
    int f4 = Integer.parseInt(a[3][4]);
    int f5 = Integer.parseInt(a[3][5]);
    int f6 = Integer.parseInt(a[3][6]);
    int f7 = Integer.parseInt(a[3][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
     
  return str1;
}

public static String sum5(String a[][]) {

    int f1 = Integer.parseInt(a[4][1]);
    int f2 = Integer.parseInt(a[4][2]);
    int f3 = Integer.parseInt(a[4][3]);
    int f4 = Integer.parseInt(a[4][4]);
    int f5 = Integer.parseInt(a[4][5]);
    int f6 = Integer.parseInt(a[4][6]);
    int f7 = Integer.parseInt(a[4][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
     
  return str1;
}

public static String arrAvg1(String a[][]) {

    int f1 = Integer.parseInt(a[0][1]);
    int f2 = Integer.parseInt(a[0][2]);
    int f3 = Integer.parseInt(a[0][3]);
    int f4 = Integer.parseInt(a[0][4]);
    int f5 = Integer.parseInt(a[0][5]);
    int f6 = Integer.parseInt(a[0][6]);
    int f7 = Integer.parseInt(a[0][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
    
    double sum2 = (Double.valueOf(sum)).doubleValue();
    double avg = sum2 / 7;
    DecimalFormat dollars = new DecimalFormat("0.00");
    avg = Double.parseDouble(dollars.format(avg));
    String str2 = (Double.valueOf(avg)).toString();
    
  return str2;
}

public static String arrAvg2(String a[][]) {

    int f1 = Integer.parseInt(a[1][1]);
    int f2 = Integer.parseInt(a[1][2]);
    int f3 = Integer.parseInt(a[1][3]);
    int f4 = Integer.parseInt(a[1][4]);
    int f5 = Integer.parseInt(a[1][5]);
    int f6 = Integer.parseInt(a[1][6]);
    int f7 = Integer.parseInt(a[1][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
    
    double sum2 = (Double.valueOf(sum)).doubleValue();
    double avg = sum2 / 7;
    DecimalFormat dollars = new DecimalFormat("0.00");
    avg = Double.parseDouble(dollars.format(avg));
    String str2 = (Double.valueOf(avg)).toString();
    
  return str2;
}

public static String arrAvg3(String a[][]) {

    int f1 = Integer.parseInt(a[2][1]);
    int f2 = Integer.parseInt(a[2][2]);
    int f3 = Integer.parseInt(a[2][3]);
    int f4 = Integer.parseInt(a[2][4]);
    int f5 = Integer.parseInt(a[2][5]);
    int f6 = Integer.parseInt(a[2][6]);
    int f7 = Integer.parseInt(a[2][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
    
    double sum2 = (Double.valueOf(sum)).doubleValue();
    double avg = sum2 / 7;
    DecimalFormat dollars = new DecimalFormat("0.00");
    avg = Double.parseDouble(dollars.format(avg));
    String str2 = (Double.valueOf(avg)).toString();
    
  return str2;
}

public static String arrAvg4(String a[][]) {

    int f1 = Integer.parseInt(a[3][1]);
    int f2 = Integer.parseInt(a[3][2]);
    int f3 = Integer.parseInt(a[3][3]);
    int f4 = Integer.parseInt(a[3][4]);
    int f5 = Integer.parseInt(a[3][5]);
    int f6 = Integer.parseInt(a[3][6]);
    int f7 = Integer.parseInt(a[3][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
    
    double sum2 = (Double.valueOf(sum)).doubleValue();
    double avg = sum2 / 7;
    DecimalFormat dollars = new DecimalFormat("0.00");
    avg = Double.parseDouble(dollars.format(avg));
    String str2 = (Double.valueOf(avg)).toString();
    
  return str2;
}

public static String arrAvg5(String a[][]) {

    int f1 = Integer.parseInt(a[4][1]);
    int f2 = Integer.parseInt(a[4][2]);
    int f3 = Integer.parseInt(a[4][3]);
    int f4 = Integer.parseInt(a[4][4]);
    int f5 = Integer.parseInt(a[4][5]);
    int f6 = Integer.parseInt(a[4][6]);
    int f7 = Integer.parseInt(a[4][7]);
    
    int sum = f1+f2+f3+f4+f5+f6+f7;
    String str1 = (Integer.valueOf(sum)).toString();  
    
    double sum2 = (Double.valueOf(sum)).doubleValue();
    double avg = sum2 / 7;
    DecimalFormat dollars = new DecimalFormat("0.00");
    avg = Double.parseDouble(dollars.format(avg));
    String str2 = (Double.valueOf(avg)).toString();
    
  return str2;
}

}