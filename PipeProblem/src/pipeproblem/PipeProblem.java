

package pipeproblem;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class PipeProblem {

    public static void main(String[] args) {
        int test=1;
        while(test!=-1)
        {
        String a,b,c;
        a= JOptionPane.showInputDialog("Enter length of on corridor: ");
        double width1= Integer.parseInt(a);
        if(width1==-1)
        {
            System.exit(0);
        }
        b= JOptionPane.showInputDialog("Enter length of the other corridor: ");
        double width2= Integer.parseInt(b);
        if(width2==-1)
        {
            System.exit(0);
        }
        double testr = length(width1,width2);
        String outStr = "Pipe Length is About: " + new DecimalFormat("#0").format(testr) + " ft";
        JOptionPane.showMessageDialog(null, outStr, "Pipe Problem" , JOptionPane.INFORMATION_MESSAGE);
        
        }
    }
    public static double length(double width1, double width2)
    {
        double h=.001;
        double le=0;
        double l2=0;
        double check=((width1/Math.sin(0))+ (width2/Math.cos(0)));
        for(double i=0;i<(Math.PI / 2);i+=0.01)
        {
            le = ((width1/Math.sin(i))+ (width2/Math.cos(i)));
            if(le<check)
            {
                check=le;
            }

        }
        return check;
    }
    
}
