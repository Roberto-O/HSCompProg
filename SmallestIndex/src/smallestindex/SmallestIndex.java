package smallestindex;
import java.util.*;

public class SmallestIndex {
   static Scanner console = new Scanner(System.in);
     public static void main(String[] args) {
        
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers to find the smallest: "); 
        for(int indexs = 0; indexs< arr.length; indexs++){
          arr[indexs] = console.nextInt();
}
          
        if (arr.length == 0)
           return;
        int small = arr[0];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++)
           if (arr[i] < small){
              small = arr[i];
              index = i;
}
        System.out.println("The smallest number is: " + small + "\nIt is in index element: " + index);
        
  
    }
    
}