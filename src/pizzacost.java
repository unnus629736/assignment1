import hsa.*;
public class pizzacost {

    
    public static void main(String[] args) {
       Console c = new Console();
       c.print("Enter the Size(inches) --> "); 
       double size=c.readInt();
        int numt;
        c.print("Enter the number of Toppings --> ");
        double bi=size*0.50;
        numt=c.readInt();
        double base = 1.50+0.75;
        double top = 0.75*numt;
        double total= top+base+bi;
        c.print("The total is $"+total);
    }
    
}
