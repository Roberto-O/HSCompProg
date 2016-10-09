//created by @Roberto
package circleinfo;
import javax.swing.*;
import java.util.*;

public class CircleInfo {
    static public double pie = 3.1416;
    static Scanner console = new Scanner(System.in);
    static Scanner console2 = new Scanner(System.in);
    
    public static void main(String[] args) {
        double center;
        double point;
        double x2;
        double y2;
        
        System.out.println("enter the center and" +  " point of a cirle (-100 to exit): ");
        center = console.nextDouble();
        x2 = console.nextDouble();
        point = console.nextDouble();
        y2 = console.nextDouble();
        
        if (center == -100 || x2 == -100  || point == -100 || y2 == -100){
            System.exit(0);
        }else{
            while((center != -100 || x2 != -100  || point != -100 || y2 != -1)){
            System.out.printf("Diameter = %.2f%n" + "Radius = %.2f%n" + "Circumference = %.2f%n" 
                + "Area = %.2f%n\n",distanceFor(center, x2, point, y2), radius(center, x2, point, y2),
                    circumference(center, x2, point, y2), area(center, x2, point, y2));
            
            System.out.println("enter the center and" +  " point of a cirle (-100 to exit): ");
            center = console.nextDouble();
            x2 = console.nextDouble();
            point = console.nextDouble();
            y2 = console.nextDouble();
            if (center == -100 || x2 == -100  || point == -100 || y2 == -100){
            System.exit(0);
                 }//end if
            }//end while
        }//end else          
    } 
    //0,0 5,0
    public static double radius(double x1, double y1, double x2, double y2){ //radius
           return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      }
    public static double distanceFor(double x1, double y1, double x2, double y2){
        double radius = radius(x1,y1, x2, y2);
        return radius * 2;
      }
    public static double circumference(double x1, double y1, double x2, double y2){
            double radius = radius(x1, y1, x2, y2);
            return 2*Math.PI*radius;
      }
    public static double area(double x1, double y1, double x2, double y2){
            double radius = radius(x1, y1, x2, y2);
            return Math.PI * (radius * radius);
      }
}
