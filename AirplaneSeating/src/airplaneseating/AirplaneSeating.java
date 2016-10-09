package airplaneseating;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class AirplaneSeating {

    public static void main(String[] args) {
      int answ = 0;
      String ques = "";
      String ques2 = "";
      
      String[][] seats = new String[13][];
        seats[0] = new String[6];
        seats[1] = new String[6];
        seats[2] = new String[6];
        seats[3] = new String[6];
        seats[4] = new String[6];
        seats[5] = new String[6];
        seats[6] = new String[6];
        seats[7] = new String[6];
        seats[8] = new String[6];
        seats[9] = new String[6];
        seats[10] = new String[6];
        seats[11] = new String[6];
        seats[12] = new String[6];
        
        for(int i = 0; i < 13; i++){
            for(int j=0; j <6; j++){
                seats[i][j]="*";
            }   
        }// assign array *
        System.out.println("                                                        Welcome to Roberto Airlines!");
        System.out.println("      ABC DEF");
        for(int l=0; l<13; l++){
            int count = l;
            count = count +=1;
            System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
        }
        System.out.println();
        
    String type = JOptionPane.showInputDialog("Please enter your ticket type: " + "\n" + "(first class, business class, economy class)") ;
    while(!type.equals("end")){
        if(type.equals("first class")){
            JOptionPane.showMessageDialog(null, "First Class!", "BETA BUILD" ,JOptionPane.INFORMATION_MESSAGE );
            ques = JOptionPane.showInputDialog("You can sit in rows 1-2. Which row would you llike?");
            answ = Integer.parseInt(ques);
            
            if(answ == 1){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 1", "BETA BUILD" ,JOptionPane.INFORMATION_MESSAGE );
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[0][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 1 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[0][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[0][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 1
            else if(answ == 2){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 2", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[1][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 2 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[1][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[1][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 2
    }//end first class
        if(type.equals("business class")){
            JOptionPane.showMessageDialog(null, "Business Class!", "BETA BUILD" ,JOptionPane.INFORMATION_MESSAGE );
            ques = JOptionPane.showInputDialog("You can sit in rows 3-7. Which row would you llike?");
            answ = Integer.parseInt(ques);
            
            if(answ == 3){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 3", "BETA BUILD" ,JOptionPane.INFORMATION_MESSAGE );
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[2][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 3 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[2][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[2][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 3
            else if(answ == 4){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 4", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[3][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 4 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[3][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[3][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 4
            else if(answ == 5){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 5", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[4][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 5 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[4][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[4][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 5
            else if(answ == 6){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 6", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[5][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 6 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[5][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[5][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 6
            else if(answ == 7){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 7", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[6][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 7 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[6][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[6][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 7
        }//end business class
            if(type.equals("economy class")){
            JOptionPane.showMessageDialog(null, "Economy Class!", "BETA BUILD" ,JOptionPane.INFORMATION_MESSAGE );
            ques = JOptionPane.showInputDialog("You can sit in rows 8-13. Which row would you llike?");
            answ = Integer.parseInt(ques);
            
            if(answ == 8){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 8", "BETA BUILD" ,JOptionPane.INFORMATION_MESSAGE );
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[7][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 8 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[7][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[7][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 8
            else if(answ == 9){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 9", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[8][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 9 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[8][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[8][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 9
            else if(answ == 10){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 10", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[9][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 10 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[9][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[9][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }// end if row 10
            else if(answ == 11){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 11", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[10][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 11 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[10][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[10][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 11
            else if(answ == 12){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 12", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[11][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 12 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[11][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[11][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 12
            else if(answ == 13){
                JOptionPane.showMessageDialog(null, "You chose to sit in Row 13", "BETA BUILD" , JOptionPane.INFORMATION_MESSAGE);
                ques2 = JOptionPane.showInputDialog("Which seat would you like to sit in? (A-F)");
                calcSeat(ques2);
                  if(seats[12][calcArr(ques2)].equals("*")){
                      JOptionPane.showMessageDialog(null, "Seat assigned:"+"\n"+"You will sit in Row 13 seat " + ques2, "Order Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                      seats[12][calcArr(ques2)] = "X";
                      System.out.println("      ABC DEF");
                        for(int l=0; l<13; l++){
                          int count = l;
                          count = count +=1;
                          System.out.println("Row "+ count + " " + seats[l][0] + seats[l][1] + seats[l][2] + " " + seats[l][3] + seats[l][4] + seats[l][5]);
                    } System.out.println();
                 }else if(seats[12][calcArr(ques2)].equals("X")){                 
                      JOptionPane.showMessageDialog(null, "Seat not assigned:"+"\n"+"Sorry seat " + ques2 + " is already taken", "Order Not Placed!" ,JOptionPane.INFORMATION_MESSAGE );
                  }
                }//end if row 13
            }//end economy class
        type = JOptionPane.showInputDialog("Please enter your ticket type: " + "\n" + "(first class, business class, economy class)") ;
  }//end while
}//end main
   public static String calcSeat(String letter){
       int num;
       
       if(letter.equals("A")){
           letter = "A";
           num = 0;
           calcArr(letter);
           return letter;
       }else if(letter.equals("B")){
           letter = "B";
           num = 1;
           return letter;
       }else if(letter.equals("C")){
           letter = "C";
           num = 2;
           return letter;
       }else if(letter.equals("D")){
           letter = "D";
           num = 3;
           return letter;
       }else if(letter.equals("E")){
           letter = "E";
           num = 4;
           return letter;
       }else if(letter.equals("F")){
           letter = "F";
           num = 5;
           return letter;
       }else{
           System.out.println("invalid seat");
           System.exit(0);
       }
       return letter;
   }
   
   public static int calcArr(String letter){
       int num = 0;
       
       if(letter.equals("A")){
           letter = "A";
           num = 0;
           return num;
       }else if(letter.equals("B")){
           letter = "B";
           num = 1;
           return num;
       }else if(letter.equals("C")){
           letter = "C";
           num = 2;
           return num;
       }else if(letter.equals("D")){
           letter = "D";
           num = 3;
           return num;
       }else if(letter.equals("E")){
           letter = "E";
           num = 4;
           return num;
       }else if(letter.equals("F")){
           letter = "F";
           num = 5;
           return num;
       }else{
           System.out.println("invalid seat num");
           System.exit(0);
       }
       return num;
   }
    
}
