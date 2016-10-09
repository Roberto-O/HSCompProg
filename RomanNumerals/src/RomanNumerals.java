//package romannumerals;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class RomanNumerals {

enum RomanToNumber {
 i(1), I(1), v(5), V(5), x(10), X(10), l(50), L(50), c(100), C(100), d(500), D(500), m(1000), M(1000); int value;
 RomanToNumber (int p){value = p;}
 int getValue(){return value;}
 }

public static void main(String[] args){
 
    RomanToNumber n;

    String Str = JOptionPane.showInputDialog("Enter some Roman Numerals for translation: ");
 
    while(!Str.equals("end")){
        if(Str.equals("end")){
            System.exit(0);
        }else{
           int n1 = 0, theNo = 0, len = Str.length();
           int[] str2No = new int [len];

     for(int i=0; i < len; i++){       
        n = RomanToNumber.valueOf(Str.substring(n1, ++n1));
        str2No[i] = n.getValue();
}
     for(int j = 0; j < (len-1); j++){
       if( str2No[j] >= str2No[j+1] ){ theNo += str2No[j]; }
        else{ theNo -= str2No[j]; }
} 
     int test = theNo += str2No[len-1];
     JOptionPane.showMessageDialog(null,"Result: " + test, "Roman Numerals Calculator", JOptionPane.INFORMATION_MESSAGE);
     Str = JOptionPane.showInputDialog("Enter some Roman Numerals for translation: ");
      } 
    } 
  }
}
   
//547 492
//111
//494