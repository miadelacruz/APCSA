import java.util.*;

public record quadrant() {
    public static void main(String [] args)

    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your x and y coordinates");


        double xcoordinate = input.nextDouble();
        double ycoordinate = input.nextDouble();
       

    if (xcoordinate>0 && ycoordinate>0){
        System.out.println("quadrant 1");
    } else if (xcoordinate>0 && ycoordinate<0){
        System.out.println("quadrant 4");
    } else if (xcoordinate<0 && ycoordinate>0){
        System.out.println("quadrant 2");
    } else if (xcoordinate<0 && ycoordinate<0)
    System.out.println("quadrant 3");

    }

}
