import hsa.*;
        
public class momentum {

   
    public static void main(String[] args) {
       Console c= new Console();

        double mass, vel, mome;
        
        c.print("Enter object's mass: ");
                mass=c.readDouble();
                
        c.print("Enter object's velocity: ");
                vel=c.readDouble();
        
        mome= vel*mass;
        
        c.print("The momentum is: "+mome);
                
    }
    
}
