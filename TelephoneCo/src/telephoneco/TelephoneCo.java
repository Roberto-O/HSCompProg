//by @Roberto
package telephoneco;
import java.util.*;

public class TelephoneCo {
    static Scanner console= new Scanner (System.in);
    static final double RegFee = 10.00;
    static final double PremFee = 25.00;
    static final double AdditionalRegMin = 0.20;
    static final double AdditionalPremDayMin = 0.10;
    static final double AdditionalPremNightMin = 0.05;
    
 public static void main(String[] args){
    
    double min =0;
    int accountnumber =0;
    char service=0;
    double nightmin=0;
    double amountdue = 0;
    double nightamount=0;
    
    System.out.println("Enter you account number: ");
    accountnumber = console.nextInt();
        
while(accountnumber != -1){
    
    System.out.println("Enter your service type: (Regular or Premium) ");
    service = console.next().charAt(0);
    
    switch (service) {
        case 'r':
        case 'R':
            System.out.println("\nEnter the amount of minutes used: ");
            min=console.nextInt();
            System.out.println("\nAccount Number: " + accountnumber);
            System.out.println("Service Type: Regular");
            regularBill(min);
            break;
        case 'p':
        case 'P':
            System.out.println("\nEnter day time minutes used: ");
            min=console.nextInt();
            System.out.println("Enter night time minutes used: ");
            nightmin = console.nextInt();
            System.out.println("\nAccount Number: " + accountnumber);
            System.out.println("Service Type: Premium");
            premiumBill(min, nightmin);
            break;
        default: System.out.println("\nInvald customer type. Please try again"); 
               }//end switch       
    System.out.println("\nEnter you account number: ");
    accountnumber = console.nextInt();
           }//end while    
        }//end main
 
 public static double regularBill(double min){
    double amountDue = 0;
    
    if (min > 50) {
        amountDue = RegFee + ((min - 50)* AdditionalRegMin);
        System.out.println("The amount of your montly bill is: $"+ amountDue);
        System.out.println("-------------------------------------------");
        return amountDue;
    }else{
        amountDue = RegFee;
        System.out.println("The amount of your montly bill is: $"+ amountDue);
        System.out.println("-------------------------------------------");
        return amountDue;
  }
}
 public static double premiumBill(double min, double nightMin){
    double nightAmount = 0;
    double amountDue = 0;
    //double minu = min;
    //double nightminu = nightMin;
    
     if (min > 75){
        if (nightMin > 100){
            nightAmount = AdditionalPremNightMin * (nightMin - 100); 
        }else{ 
            nightAmount=0; }
            amountDue = PremFee + (min-75)* AdditionalPremDayMin+ nightAmount;
            System.out.println("The total of your monthly bill is: $"+ amountDue); 
            System.out.println("-------------------------------------------");
            return amountDue;
    }else{
        if (nightMin >100){
            nightAmount = AdditionalPremNightMin * (nightMin - 100); 
        }else{ nightAmount=0; }
            amountDue = PremFee + nightAmount; System.out.println("The total of your monthly bill is: $" + amountDue); 
            System.out.println("-------------------------------------------");
            return amountDue;
  }
 }
}  
//321