import java.util.*;
public class polynomial {
    public static void main(String [] args)
    {
        int x = -12;
        double y;
        double first = 6;
        double second = 5;
        double third = 4;
        double fourth = 3;
        double fifth = 2;
        for(;x<=16;x++){
y=( Math.pow(x,first)) -(3*Math.pow(x,second))-(93*Math.pow(x,third)) + (87*Math.pow(x,fourth)) +(1596*Math.pow(x,fifth))-(1380*x)-2800;

        
System.out.println("y = "+ y + " x = " + x);
        }
    }
}
