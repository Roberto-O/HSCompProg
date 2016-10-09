package masterpoint;
import java.lang.*;

public class Cylinder extends Point{
    private int r;
    private int h;
    
    public Cylinder(){
        
    }
    
    public Cylinder(int x, int y, int r, int h){
        super(x, y);
	this.r = r;
        this.h = h;
    }
    
    public void setR(int r){
	this.r = r;
    }

    public void setH(int h){
        this.h = h;
    }
    
    public int getR(){
	return r;
    }
	
    public int getH(){
        return h;
    }
    
    public double volume(){
	return Math.PI*r*r*h;
    }
	
    public double surfArea(){
	return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }
}

