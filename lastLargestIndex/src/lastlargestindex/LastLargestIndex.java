package lastlargestindex;
import java.util.*;

public class LastLargestIndex {
   static Scanner console = new Scanner(System.in);
     public static void main(String[] args) {
        
        int[] array = new int[10];
        System.out.println("Enter 10 numbers to find the largest: "); 
        
        for(int indexs = 0; indexs< array.length; indexs++){
          array[indexs] = console.nextInt();
        }
       // if (array.length == 0){
         //  return;}
        
        int small = array[0];
        int index = 0;
        
        for (int i = 0; i < array.length; i++)
           if (array[i] > small){
              small = array[i];
              index = i;
}
        System.out.println("\nThe largest number is: " + small + "\nIt is in index element: " + index);
        //System.out.print(small);
  
    }
    


}
