//package tests;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.text.*;

public class Tests {

    public static final int OPTIONS = 5;
    private List<JTextField> textfields = new ArrayList<>(OPTIONS);
    private JPanel panel;
    
    public static void main(String[] args) {
        
    
        String[] fName = new String[10];
        String[] lName = new String[10];
        
        int i=0;
        while(i<10){
            try{
                fName[i] = JOptionPane.showInputDialog("Enter First Name:");
                i++;
           }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter valid number");
    }
}//end while1
    
        int j=0;
        while(j<10){
            try{
                lName[j] = JOptionPane.showInputDialog("Enter Last Name:");
                j++;
           }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter valid number");
    }
}//end while2
        System.out.println(Arrays.toString(fName));
        System.out.println(Arrays.toString(lName));
        String tester = fName[0] + " " + lName[0];
        System.out.println(tester);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                for(int k = 0; k < 5; k++){
                     createAndShowGUI();
                }
               
            }});
        
    }//end main   
    
    public Tests(){
        panel = new JPanel();

        for(int i=0; i<OPTIONS; i++){
            JTextField textfield = new JTextField(5);
            textfields.add(textfield);
            panel.add(new JLabel(Integer.toString(i+1)+": "));
            panel.add(textfield);
        }
    }

    private static void createAndShowGUI() {
          Tests input = new Tests();
          int result = JOptionPane.showConfirmDialog(null, input.panel, 
                   "Please Enter Test Scores", JOptionPane.OK_CANCEL_OPTION);
          if (result == JOptionPane.OK_OPTION) {
             for(JTextField textfield : input.textfields){
                 System.out.println(textfield.getText()); 
                 
             }

          }
    }
    
    
    
}//end class
