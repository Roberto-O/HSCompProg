package emirps;
import javax.swing.*;

public class Emirps {

    public static void main(String[] args) 
    {
        int loop = 1;
        String inp;
        int counter = 0;
        int nem = 13;
        
        System.out.print("First One Hundred Emirps!\n\t");
        while (counter < 100) {
            if (Emirp(nem)){
                System.out.print(nem + "\t");
                    counter++;
                if (counter % 10 == 0) {
                    System.out.println();
        }  
    }          
nem++;        
}
        while(loop != -1){
          inp = JOptionPane.showInputDialog("Check if Prime and Emirp");
          int number = Integer.parseInt(inp);
          
          loop = number;
          if(number == -1){
             System.exit(0);
          }else{
            String output = "Prime is: " + primeNumber(number)+ "\nEmirp is: " + Emirp(number);
            JOptionPane.showMessageDialog(null, output, "Emirps",  JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
   
    public static boolean primeNumber(int n) {
        for (int i = 2; i <= n / 2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean Emirp(int n) {
        return primeNumber(n) && primeNumber(reversal(n));
    }

    public static int reversal(int n) {
        if (n < 10) {
            return n;
        }
        return recursive(n % 10, n / 10);
    }

    public static int recursive(int a, int b)
    {
        if (b < 1) {
            return a;
        }
        return recursive(a * 10 + b % 10, b / 10);
    }
}
