package findarea;
import java.util.*;

public class FindArea{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double radius;
        double height;
        int choice;

        System.out.println("This program can calculate "
                         + "the area of a rectangle, the area "
                         + "of a circle, or volume of a cylinder.");
        System.out.println("To run the program enter: ");
        System.out.println("1: To find the area of rectangle.");
        System.out.println("2: To find the area of a circle.");
        System.out.println("3: To find the volume of a cylinder.");
        System.out.println("-1: To terminate the program.");
        choice = console.nextInt();
        if(choice==-1)
        {
            System.exit(0);
        }
        else{
        System.out.println();
        }
        

        while (choice != -1)
        {switch (choice)
        {
            case 1:
                 System.out.print("Enter the length and the width "
                                + "of the rectangle: ");
                double length, width;
                length  = console.nextDouble();
                width  = console.nextDouble();
                if( length == -1|| width==-1)
                {
                    System.exit(0);
                }
                else{
                System.out.println();
                System.out.printf("Area = %.2f%n\n", rectangle(length, width));
                }
                break;
    
            case 2:
                System.out.print("Enter the radius of the circle: ");
                radius = console.nextDouble();
                if(radius==-1)
                {
                    System.exit(0);
                }
                else
                {
                System.out.println();
                System.out.printf("Area = %.2f%n\n",
                                  circle(radius));
                }
               
                
                break;
            case 3:
                System.out.print("Enter the radius of the base and "
                               + "the height of the cylinder: ");
                radius = console.nextDouble();
                height = console.nextDouble();
                if(radius ==-1 || height==-1)
                {
                    System.exit(0);
                }
                else{
                System.out.println();
                
                System.out.printf("Volume = %.2f%n\n",
                                  cylinder(radius, height));

                }
                break;
            default:
                System.out.println("Invalid choice!");
                //System.exit(0);
        }
        System.out.println("To run the program enter: ");
        System.out.println("1: To find the area of rectangle.");
        System.out.println("2: To find the area of a circle.");
        System.out.println("3: To find the volume of a cylinder.");
        System.out.println("-1: To terminate the program.");
        choice = console.nextInt();
        System.out.println();
        }

        
    }

    public static double rectangle(double l, double w)
    {
        return l * w;
    }

    public static double circle(double r)
    {
        return Math.PI * (r * r);
    }

    public static double cylinder(double bR, double h)
    {
        return Math.PI * bR * bR * h;
    }
}

//fixed by roberto
