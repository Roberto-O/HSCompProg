package masterpoint;
import java.lang.*;

public class Circle extends Point{
    private int r;
	
    public Circle(){
        
    }
	
    public Circle(int x, int y, int r){
	super(x, y);
	this.r = r;
    }
	
    public void setR(int r){
	this.r = r;
    }
	
    public int getR(){
	return r;
    }
	
    public double area(){
	return Math.PI*r*r;
    }
	
    public double circumference(){
	return 2*Math.PI*r;
    }
}
