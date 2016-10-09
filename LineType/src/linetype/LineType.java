package linetype;
import javax.swing. *;
import java.util. *;

public class LineType {

    
    public static void main(String[] args) {
        //Scanner ci = new Scanner ( System.in);
         Line line1 = new Line ();
         String s, s1, s2, s3, s4, s5;
         double a1, a2, b1, b2, c1, c2;
         int response = JOptionPane.showConfirmDialog (null,"Would you like to enter two equation of a " + "Line in standard form?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    
     while (response == 0) {
         s = JOptionPane . showInputDialog ("Enter the coefficient A of AX + BY = C");
         a1 = Double.parseDouble (s);
         
         s1 = JOptionPane.showInputDialog ("Enter the coefficient B of AX + BY = C.");
         b1 = Double.parseDouble (s1);
         
         s2 = JOptionPane.showInputDialog ("Enter the coefficient C of AX + BY = C.");
         c1 = Double.parseDouble (s2);
         
         s3 = JOptionPane.showInputDialog ("Enter another coefficient A of AX + BY = C.");
         a2 = Double.parseDouble (s3);
     
         s4 = JOptionPane.showInputDialog ("Enter another coefficient B of AX + BY = C.");
         b2 = Double.parseDouble (s4);
      
         s5 = JOptionPane.showInputDialog ("Enter another coefficient C of AX + BY = C");
         c2 = Double.parseDouble (s5);
      
      line1.setLine1 (a1, b1, c1);
      line1.setLine2 (a2, b2, c2);
      
      System.out.println ("You have enter the following");
      System.out.println("First equation A is " + line1.getA1() + ", B is " + line1.getB1() + " and C is " + line1.GETC1());
      System.out.println("Second equation A is " + line1.getA2() + ", B is " + line1.getB2() + " and C is " + line1.getC2 ());
      System.out.println(line1.slope1() + line1.slope2());
      System.out.println(line1.parallel() + line1.perpendicular() + line1.equal());
      response = JOptionPane.showConfirmDialog(null, "Would you like to enter another two equation of a line " + "In standard form?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        }
    }
} 
//2 -1 2 
//4 4 0