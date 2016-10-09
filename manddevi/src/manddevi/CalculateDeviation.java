package manddevi;

public class CalculateDeviation {
    
 public static double average(double[]x){
 double total = 0;
 double avg=0;
    
 for(int i = 0; i<x.length; i++){
    total += x[i];
  }
    avg = total/x.length;
    return avg;
}//end

 public static double standardDeviation(double[]x, double avg){
  double sum=0;
  
  for(int i = 0; i < x.length; i++){
    sum = sum+Math.pow(x[i]-avg, 2);
   }
     return Math.sqrt(sum/x.length);
  }//end
 
}//final
