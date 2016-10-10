package taxreturn;
import java.text.DecimalFormat;
import javax.swing.*;

public class TaxReturn {

   
    public static void main(String[] args) {
        
    double consultTime;
    double hourlyRate;
    double user = 0;
    double loop = 0;
    //client = loop;

        if ( loop == -1){
            System.exit(0);
        }
        else{
            String cIncome = JOptionPane.showInputDialog("Enter your income: ") ;
            user = Double.parseDouble(cIncome);
     
            String  time = JOptionPane.showInputDialog ("Enter your consulting time: ");
            consultTime = Double.parseDouble(time);
     
            String rate = JOptionPane.showInputDialog("Enter your hourly rate: ");
            hourlyRate = Double.parseDouble(rate);
            
            double test = calculateBill(user,consultTime,hourlyRate);
            String output = "The Billing Amount is $ " + new DecimalFormat("#,##0.00;-#,##0.00").format(test);
            JOptionPane.showMessageDialog(null, output, "BETA BUILD" ,JOptionPane.INFORMATION_MESSAGE );
   
   } 
}

public static double  calculateBill(double userInc, double consultTime, double hourlyRate){
    if (userInc <= 25000){
        if (consultTime <= 30)
            return 0;
        else
            return hourlyRate * 0.40 * ((consultTime - 30) / 60);
   }else{
        if (consultTime <= 20)
            return 0;
        else 
            return hourlyRate * 0.70 * ((consultTime - 20) / 60);  
      }
   }
}


    

