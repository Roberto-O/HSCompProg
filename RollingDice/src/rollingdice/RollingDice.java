package rollingdice;
import java.util.Random;
import java.util.Arrays;

public class RollingDice {
  public static final int NUMBER_OF_EXPERIMENTS = 1000;
  public static double max;
  
    public static void main(String[] args) {
      double [] arr = new double[12];  
      int count = 0;
      Random randomNumbers = new Random();
      int die1=0;
      int die2=0;
      int[] totals = new int[13];
      
        for (int index = 0; index < totals.length; index++)
            totals[index]=0;
        for (int roll = 1; roll <= 1000; roll++){
            die1 = 1 + randomNumbers.nextInt(6);
            die2 = 1 + randomNumbers.nextInt(6);
            totals[die1 + die2]++;
    }
        System.out.printf(" %12s%18s\n","Sum of Spots on Faces"," Frequency of Sum");
      
        for (int dice = 2; dice < totals.length; dice++){
          arr[count]= totals[dice];
          count++;
          max=0;
            for (int i=0; i<12; i++){
              if ( max < arr[i] ) {
                max = arr[i];
            }
              
         }
System.out.printf(" %12d%22d\n", dice, totals[dice]);
      }
System.out.println("The sum that was rolled the most was");
System.out.println(max);
   }

}

//die1 = (int)(Math.random()*6) + 1;
//die2 = (int)(Math.random()*6) + 1;