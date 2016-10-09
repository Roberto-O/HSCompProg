
package maxvolume;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class MaxVolume {

  
    public static void main(String[] args) {
        int loop = 1;
        String a, b;
        double l, w;
        
        while (loop != -1){
        a = JOptionPane.showInputDialog("Enter the length: ");
        l = Double.parseDouble(a);
           if (l == -1){
              System.exit(0);
}
        b = JOptionPane.showInputDialog("Enter the width: ");
        w = Double.parseDouble(b);
           if(w == -1){
             System.exit(0);
}
        double test = volume(l,w);
        double test2 = hi2(l,w);
        String outStr="Maximum Volume: " + new DecimalFormat("#0.000").format(test) + " in³" + "\n" + "Height is: " 
                + new DecimalFormat("#0.00").format(test2) + " in";
        JOptionPane.showMessageDialog(null,outStr , "Box Problem", JOptionPane.INFORMATION_MESSAGE);
        }
       //24 18 
}
    public static double volume(double l, double w){
        double h = 0;
        double volume = 0;
        double check = 0;
        
        for(double i = 0; i<(.5*Math.min(l,w)); i+=0.001){
          check =(l-(2*i))*(w-(2*i))*i;
          volume = (l-(2*h))*(w-(2*h))*h;
          
            if(Math.max(check,volume)==check){
                h=i;
            } 
        }
        return volume;
    }
    public static double hi2(double l, double w){
        double h = 0;
        double volume = 0;
        double check = 0;
        
        for(double i = 0; i<(.5*Math.min(l,w)); i+=0.001){
          check =(l-(2*i))*(w-(2*i))*i;
          volume = (l-(2*h))*(w-(2*h))*h;
          
            if(Math.max(check,volume)==check){
                h=i;
            } 
        }
        return h;
    }
}
