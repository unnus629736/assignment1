import hsa.*;
import TurtleGraphics.*;

public class makeLine {

    
    public static void main(String[] args) {
        Console c = new Console();
        double x1=0, x2=0, y1=0, y2=0;
        c.print("Enter x-1 -->");
          x1= c.readDouble();
        c.print("Enter x-1 -->");
        y1= c.readDouble();
        c.print("Enter y-1 -->");
        x2= c.readDouble();
        c.print("Enter x-2 -->");
        y2= c.readDouble();
        c.print("Enter y-2 -->");
        c.close();
        
        SketchPadWindow sp= new SketchPadWindow(400,400);
        
        StandardPen p =new StandardPen(sp);
        
        p.up();
        p.move(x1-200,y1-200);
        p.down();
        p.move(y2-200, y1-200);
        
    }
    
}
