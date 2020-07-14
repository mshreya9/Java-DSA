class Solution {
    public double angleClock(int h, int m) {
         if(h == 12) 
            h = 0; 
         if(m == 60){ 
            m = 0; 
            h += 1; 
            if(h>12) 
              h = h-12; 
        }  


        // Calculate the angles moved by hour and minute hands 
        // with reference to 12:00 
        double hour_angle = 0.5 * (h*60 + m); 
        double minute_angle = 6*m; 
  
        double angle = Math.abs(hour_angle - minute_angle);   
        angle = Math.min(360-angle, angle); 
  
        return angle; 
    }
}