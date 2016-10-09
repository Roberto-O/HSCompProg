package linetype;
//DecimalFormat df = new DecimalFormat("#.#####");
//df.format(0.912385);

public class Line {
     private double a2, a1, b2, b1, c2, c1;
     
         Line() {
             
         }
         
 public void setLine1 (double a, double b, double c){
     a1 = a;  b1 = b;  c1 = c;
 }

 public void setLine2 (double a, double b, double c) {
     a2 = a;  b2 = b;  c2 = c;
 }
 
 public String slope1 () {
     if (b1 == 0){
         return ("Verticle line and the slope is Undefined.");
     }else if (a1 == 0){
         return ("Horizontal line and the slope is 0.");
     }else {
       Double m = Double.parseDouble ( Double.toString (a1));
       Double m2 = Double.parseDouble ( Double.toString (b1));
       Double slope1;  
       slope1 = (- 1 * m) / m2;
       return ("The slope of the first line is " + String.format("%.2g%n", slope1)); //+ ".");
    }
 }
 
 public String slope2 () {
     if (b2 == 0){
         return (" Verticle line and the slope is Undefined.");
    }else if (a2 == 0){
         return (" Horizontal line and the slope is 0.");
    }else{
       Double m3 = Double.parseDouble ( Double.toString (a2));
       Double m4 = Double.parseDouble ( Double.toString (b2));
       Double slope2;  
       slope2 = (- 1 * m3) / m4;
       return ("The slope of the second line is " + String.format("%.2g%n", slope2));//+ ".");
    }
 }
 
 public String equal () {
    if ((a1 == a2) && (b1 == b2) && (c1 == c2)) {
       return ("| and equal ✓");
    }else{
      return ("| and not equal ✗");
    }
 }
 
 public String parallel () {
    double m = (- 1 * a1) / b1;
    double m1 = (- 1 * a2) / b2;
      if (m == m1){
        return ("The lines are parallel ✓ ");
      }else if (b1 == 0 && b2 == 0){
        return ("The lines are parallel ✓ ");
   }return ("The lines are not parallel ✗ ");
}
 
 public String perpendicular () {
    double m = (- 1 * a1) / b1;
    double m1 = (- 1 * a2) / b2;
        if ((a1 == 0) & (b2 == 0)){
           return ("| perpendicular ✓ ");
        }else if ((b1 == 0) & (a2 == 0)){
           return ("| perpendicular ✓ ");
        }else if ((m * m1) == - 1){
           return ("| perpendicular ✓ ");
    }return ("| not perpendicular ✗ ");
 }
 
/* public String test(){
     a1 + b1 = c1;
     b1 = c1 - a1;
     b1/b1 = (c1 - a1) / b1;
 }*/
 
 public double getA1(){
      return a1;
}             
 public double getB1(){
      return b1;
}
 public double GETC1(){
      return c1;
}
 public double getA2(){
      return a2;
}
 public double getB2(){
      return b2;
}
 public double getC2(){
      return c2;
   }
}
