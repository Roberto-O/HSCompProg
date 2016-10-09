package highlowtemp;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HighLowTemp  {

    public static void main(String[] args) {
        
    int m, n, c, d;
    Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      double first[][] = new double[m][n];
      double second[][] = new double[m][n];
      double sum[][] = new double[m][n];
 
      System.out.println("Enter the highest temperature for each month: ");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            first[c][d] = in.nextInt();
 
      System.out.println("Enter the lowest temperature for each month: ");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            second[c][d] = in.nextInt();
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
 //---------------------------------------------------------------------------------------------------------------------------
      
       System.out.println("Average Highest Temperature is: " + arrayAverage(first));
       double max = first[0][0];
       double maxI = 0, maxJ = 0;
        
        for(int i = 0; i < first.length; i++){
            for(int j = 0; j < first[i].length; j++){
                if(first[i][j] > max){
                    max = first[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
       System.out.println("\nThe Highest temperture was: " + max + "\nIt is in index element: " + maxI + "," + maxJ + "\n");
       
       System.out.println("Average Lowest Temperature is: " + arrayAverages(second));
       double low = second[0][0];
       double lowI = 0, lowJ = 0;
       
        for(int i = 0; i < second.length; i++){
            for(int j = 0; j < second[i].length; j++){
                if(second[i][j] < low){
                    low = second[i][j];
                    lowI = i;
                    lowJ = j;
                }
            }
        }
       System.out.println("\nThe Lowest temperture was: " + low + "\nIt is in index element: " + lowI + "," + lowJ);
   }
    
 //------------------------------------------------------------------------------------------------------------------------   
    public static double arrayAverage(double a[][]) {

    double sum = 0.0;
    int count = 0; 

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            sum += a[i][j];
            count++;
        }
    }
    return sum / count;
}
    
    public static double arrayAverages(double a[][]) {

    double sum = 0.0;
    int count = 0; 

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            sum += a[i][j];
            count++;
        }
    }
    return sum / count;
}


}
    