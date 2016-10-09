package pool;


public class SwimmingPool
{
        //double DRAIN_RATE; //gallons per hourzz
        static final double GALLONS_PER_CUBIC_FOOT = 7.48;
       
     
        double length, DRAIN_RATE, width, depth, fillRate;
        double howFull;
       
   
public SwimmingPool(){
                setPool(0, 0, 0, 0, 0, 0);
       
        }
       
public SwimmingPool(double l, double w, double d, double f, double dr, double h){
                setPool(l, w, d, f, dr, h);
        }
       

public SwimmingPool(SwimmingPool otherSwimmingPool){
                length = otherSwimmingPool.length;
                width = otherSwimmingPool.width;
                depth = otherSwimmingPool.depth;
                fillRate = otherSwimmingPool.fillRate;
                DRAIN_RATE = otherSwimmingPool.DRAIN_RATE;
                howFull = otherSwimmingPool.howFull;
        }

public void setPool(double l, double w, double d, double f, double dr, double h){
    if (l >= 0){
        length = l;
   }else{
        length = 0;              
   }if(w >= 0){
        width = w;
   }else{
        width = 0;                   
   }if(d >= 0){
        depth = d;
   }else{
        depth = 0;                
   }if (f >= 0){
        fillRate = f;
   }else{
        fillRate = 0;
   }if(dr >= 0){
       DRAIN_RATE = dr;
   }else{
       DRAIN_RATE = 0;
   }if (h >= 0){
        howFull = h;
   }else{
        howFull = 0;
   }
}
       
        public void setLength(double l){
                length = l;
               
        }
        public void setWidth(double w){
                width = w;
        }
       
        public void setDepth(double d){
                depth = d;
        }
       
        public void setFillRate(double f){
               //f = fillRate / 60;
               fillRate = f;
              
        }
        
        public void setDrainRate(double dr){
            //DRAIN_RATE = DRAIN_RATE / 60;
            DRAIN_RATE = dr;
        }
        
        public void setHowFull(double h){
                howFull = h;
        }
       
        public double getLength(){
                return length;
        }//end of getLength

        public double getWidth(){
                return width;
        }//end of getWidth
       

        public double getDepth(){
                return depth;
        }//end of getDepth
       

        public double getFillRate(){
                return fillRate;
        }//end of getFillRate
        
        public double getDrainRate(){
            return DRAIN_RATE;
        }
        
        public double getHowFull(){
                return howFull;
        }//end of getHowFull
       

        public double getVolume(){
                double volume;
               
                volume = length * width * depth;
                volume = volume * GALLONS_PER_CUBIC_FOOT;
                //volume = 5000;
                return volume;
               
        }//end of getVolume
        
       //gloriusyp1114 01858gp

        public double waterNeededToFill(){       
                double waterNeeded, percent;
                double volumeGal = getVolume();
                percent = volumeGal * (howFull / 100.00);
                waterNeeded = getVolume() - percent;
                return waterNeeded;
               
        }//end of waterNeededToFill
       

        public double timeToFill()
        { 
            fillRate = fillRate * 60;
            //System.out.println(fillRate);
             
                double time, sets;
                sets = fillRate - DRAIN_RATE;
                time = waterNeededToFill() / sets;                                
                return time;
                
        }//end timeToFill
       
 public double timeToEmpty()
        {
                double time;
               
              //  if(howFull == 0)
              //  {
               //         time = getVolume() / DRAIN_RATE;
              //  }
             //   else
             //   {
                        time = howFull / DRAIN_RATE;
             //   }
                return time;
        }//end of time to empty
       

        public void addWater(double time)
        {
                howFull = (fillRate - DRAIN_RATE) * time;
        }//end addWater
       
        public void drainWater(double time)
        {
                howFull = DRAIN_RATE * time;
        }
               
}//end of class SwimmingPool