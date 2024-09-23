
import java.util.*;


public record recipeadjust() {
    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("This cookie recipe makes 48 cookies");
        System.out.println("We can adjust the recipe based on how manu cookies you would like");
        System.out.println("Please enter in a number of cookies you would like to make");



        int cookies = input.nextInt();
        double flour = ((double) cookies/48) * 2.75;
        double sugar = ((double) cookies/48) * 1.5;
        double butter = ((double) cookies/48) * 1.0;

        

        System.out.println("The ingredients you need to purchase are" + flour + "cups of flour");
        System.out.println(sugar + "cups of sugar");
        System.out.println(butter + "cups of butter");
    }

}
