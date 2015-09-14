import hsa.*;
import TurtleGraphics.*;
public class bargraph {

    
    public static void main(String[] args) {
      Console c = new Console();
      //data entery
      double num1,num2, num3, num4; 
       c.print("Enter value 1 --> ");
       num1 = c.readDouble();
       c.print("Enter value 2 --> ");
       num2 = c.readDouble();
       c.print("Enter value 3 --> ");
       num3 = c.readDouble();
       c.print("Enter value 4 --> ");
       num4 = c.readDouble();
       c.close();
       //drawing graph
       SketchPadWindow sp = new SketchPadWindow(400,400);
       StandardPen p = new StandardPen(sp);
       p.setWidth(20);
       //bar 1
       p.up();
       p.move(-150, -150);
       p.down();
       p.setDirection(90);
       p.move(num1);
       p.up();
       p.move(20);
       p.drawString("("+num1+")");
       //bar 2
       p.up();
       p.move(-100, -150);
       p.down();
       p.setDirection(90);
       p.move(num2);
       p.move(20);
       p.drawString("("+num2+")");
       //bar 3 
       p.up();
       p.move(-50, -150);
       p.down();
       p.setDirection(90);
       p.move(num3);
       p.move(20);
       p.drawString("("+num3+")");
       //bar 4 
       p.up();
       p.move(0, -150);
       p.down();
       p.setDirection(90);
       p.move(num4);
       p.move(20);
       p.drawString("("+num4+")");
    }
    
}
