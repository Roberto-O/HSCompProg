package pointscyl;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.text.*;

public class PointsCyl {
static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
	int loopDecision, xC, yC, rC, hC;
        DecimalFormat deci = new DecimalFormat("0.00");
        String[ ][ ] aryNumbers = new String[11][11];
        
        aryNumbers[0][0] = "10";  aryNumbers[1][0] = " 9"; aryNumbers[2][0] = " 8"; aryNumbers[3][0] = " 7"; aryNumbers[4][0] = " 6";   aryNumbers[5][0] = " 5";aryNumbers[6][0] = " 4";aryNumbers[7][0] = " 3";aryNumbers[8][0] = " 2";aryNumbers[9][0] = " 1";aryNumbers[10][0] = "  ";
        aryNumbers[0][1] = " ";   aryNumbers[1][1] = " ";  aryNumbers[2][1] = " ";  aryNumbers[3][1] = " ";  aryNumbers[4][1] = " ";    aryNumbers[5][1] = " "; aryNumbers[6][1] = " "; aryNumbers[7][1] = " "; aryNumbers[8][1] = " "; aryNumbers[9][1] = " "; aryNumbers[10][1] = "1";
        aryNumbers[0][2] = " ";   aryNumbers[1][2] = " ";  aryNumbers[2][2] = " ";  aryNumbers[3][2] = " ";  aryNumbers[4][2] = " ";    aryNumbers[5][2] = " "; aryNumbers[6][2] = " "; aryNumbers[7][2] = " "; aryNumbers[8][2] = " "; aryNumbers[9][2] = " "; aryNumbers[10][2] = "2";
        aryNumbers[0][3] = " ";   aryNumbers[1][3] = " ";  aryNumbers[2][3] = " ";  aryNumbers[3][3] = " ";  aryNumbers[4][3] = " ";    aryNumbers[5][3] = " "; aryNumbers[6][3] = " "; aryNumbers[7][3] = " "; aryNumbers[8][3] = " "; aryNumbers[9][3] = " "; aryNumbers[10][3] = "3";
        aryNumbers[0][4] = " ";   aryNumbers[1][4] = " ";  aryNumbers[2][4] = " ";  aryNumbers[3][4] = " ";  aryNumbers[4][4] = " ";    aryNumbers[5][4] = " "; aryNumbers[6][4] = " "; aryNumbers[7][4] = " "; aryNumbers[8][4] = " "; aryNumbers[9][4] = " "; aryNumbers[10][4] = "4";
        aryNumbers[0][5] = " ";   aryNumbers[1][5] = " ";  aryNumbers[2][5] = " ";  aryNumbers[3][5] = " ";  aryNumbers[4][5] = " ";    aryNumbers[5][5] = " "; aryNumbers[6][5] = " "; aryNumbers[7][5] = " "; aryNumbers[8][5] = " "; aryNumbers[9][5] = " "; aryNumbers[10][5] = "5";
        aryNumbers[0][6] = " ";   aryNumbers[1][6] = " ";  aryNumbers[2][6] = " ";  aryNumbers[3][6] = " ";  aryNumbers[4][6] = " ";    aryNumbers[5][6] = " "; aryNumbers[6][6] = " "; aryNumbers[7][6] = " "; aryNumbers[8][6] = " "; aryNumbers[9][6] = " "; aryNumbers[10][6] = "6";
        aryNumbers[0][7] = " ";   aryNumbers[1][7] = " ";  aryNumbers[2][7] = " ";  aryNumbers[3][7] = " ";  aryNumbers[4][7] = " ";    aryNumbers[5][7] = " "; aryNumbers[6][7] = " "; aryNumbers[7][7] = " "; aryNumbers[8][7] = " "; aryNumbers[9][7] = " "; aryNumbers[10][7] = "7";
        aryNumbers[0][8] = " ";   aryNumbers[1][8] = " ";  aryNumbers[2][8] = " ";  aryNumbers[3][8] = " ";  aryNumbers[4][8] = " ";    aryNumbers[5][8] = " "; aryNumbers[6][8] = " "; aryNumbers[7][8] = " "; aryNumbers[8][8] = " "; aryNumbers[9][8] = " "; aryNumbers[10][8] = "8";
        aryNumbers[0][9] = " ";   aryNumbers[1][9] = " ";  aryNumbers[2][9] = " ";  aryNumbers[3][9] = " ";  aryNumbers[4][9] = " ";    aryNumbers[5][9] = " "; aryNumbers[6][9] = " "; aryNumbers[7][9] = " "; aryNumbers[8][9] = " "; aryNumbers[9][9] = " "; aryNumbers[10][9] = "9";
        aryNumbers[0][10] = " ";  aryNumbers[1][10] = " "; aryNumbers[2][10] = " "; aryNumbers[3][10] = " "; aryNumbers[4][10] = " ";   aryNumbers[5][10] = " ";aryNumbers[6][10] = " ";aryNumbers[7][10] = " ";aryNumbers[8][10] = " ";aryNumbers[9][10] = " ";aryNumbers[10][10] = "10";
        
//        System.out.println("Enter 1 to insert your own values. " + "Enter 2 to use preset values.");
//        loopDecision = console.nextInt();
        String loopdecis = JOptionPane.showInputDialog(null, "Enter 1 to insert your own value." + "Enter 2 to use preset values.");
        loopDecision = Integer.parseInt(loopdecis);
            if(loopDecision == 1){ //user own value
                String base1 = JOptionPane.showInputDialog(null,"Enter a number 1-10 for the X coordinate. Center of the base");
                xC = Integer.parseInt(base1);
                String base2 = JOptionPane.showInputDialog(null,"Enter a number 1-10 for the Y coordinate. Center of the base");
                yC = Integer.parseInt(base2);
                String radi = JOptionPane.showInputDialog(null,"Enter the radius of the base.");
                rC = Integer.parseInt(radi);
                String hite = JOptionPane.showInputDialog(null,"Enter the height of the base.");
                hC = Integer.parseInt(hite);
			
                Cylinder p = new Cylinder(xC, yC, rC, hC);
                
                System.out.println("X,Y coordinate: " + "("+ p.getX()+ ","+ p.getY()+")");
                System.out.println();
			
                int ycord = p.getX(); //no method needed. 2nd num
                int xcord = p.getY();
                fx(xcord); //gets new 1st num
                
                aryNumbers[fx(xcord)][ycord] = "*";
                
                int rows = 11, columns = 11;
                int i,j;
                   for(i=0; i<rows; i++){
                     for(j=0; j<columns;j++){
                       System.out.print(aryNumbers[i][j]+ " " );
                    }
                  System.out.println( "" );
                }//end for loop graph
               			
		System.out.println();
		System.out.println("Radius = " + p.getR());		
		System.out.println("Height = " + p.getH());	
		System.out.println("Volume of the cylinder = " + deci.format(p.volume()));
		System.out.println("Surface Area of the cylinder = " + deci.format(p.surfArea()));
                
            }else{
		Cylinder p = new Cylinder(5, 5, 4, 5);
	
		System.out.println("X,Y coordinate: " + "("+ p.getX()+ ","+ p.getY()+")");
                System.out.println();
					
		int ycord = p.getX(); //no method needed. 2nd num
                int xcord = p.getY();
                fx(xcord); //gets new 1st num
                
                aryNumbers[fx(xcord)][ycord] = "*";
                
                int rows = 11; int columns = 11;
                int i,j;
                   for(i=0; i<rows; i++){
                     for(j=0; j<columns;j++){
                       System.out.print(aryNumbers[i][j]+ " " );
                    }
                  System.out.println( "" );
                }//end for loop graph
			
		System.out.println();
		System.out.println();
		System.out.println("Radius = " + p.getR());
		System.out.println("Height = " + p.getH());	
		System.out.println("Volume of the cylinder = " + deci.format(p.volume()));
		System.out.println("Surface Area of the cylinder = " + deci.format(p.surfArea()));
	}
    }
    
    public static int fx (int n){
        int rnum = 10 - n;
        return rnum;
    }
}
