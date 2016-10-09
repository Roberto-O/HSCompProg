package arrays;
import java.util.*;

public class Arrays {

static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
    double[] alpha = new double[50];
    
     for(int x = 0; x < 50; x++){
        if (x<25){
            alpha[x] = x*x;
        }if (x>=25){
            alpha[x] = x*3;
        }

        System.out.print(alpha[x] + ", ");

        if (x%10 == 9){
            System.out.print("\n");
      }
    }   
  }
} 






















































//-----------------------------------------------------------------------------------------------------------------------------
    /* double[] sales = {12.50, 8.35, 19.60, 25.00, 14.00, 39.43, 35.90, 98.23, 66.65, 35.64};
    double largestsale, sum, average;
    
    for(int index = 0; index < sales.length; index++){
        sales[index] = 10.00;
        System.out.print(sales[index] + " ");
    }
    
    sum = 0;
    for(int inde = 0; inde < sales.length; inde++){
        sum = sum + sales[inde];
        System.out.print("\n" + sum + " ");
    }
    
    if(sales.length != 0){
        average = sum/sales.length;
        System.out.print("\n" + average + " ");
    }else{
        average = 0.0;
    }
    
    int maxIndex = 0;
    for(int index = 1; index < sales.length; index++){
        if(sales[maxIndex] < sales[index]){
            maxIndex = index;
        }
        largestsale = sales[maxIndex];
    }
      
*/
