//Class: APCSA
/*Name: Mia Dela Cruz
*Date: 9/9/24
*Assignment: miniCalculator
 */
import java.util.*;


public record miniCalculator() {
    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers");
       
        int firstint = input.nextInt();
        int secondint = input.nextInt();
        int sumint = (firstint + secondint);
        int difference = Math.abs(firstint - secondint);
        int product = (firstint * secondint);
        double average = (firstint+ secondint) / 2;
        int min = Math.min(firstint, secondint);
        int max = Math.max(firstint, secondint);
       

    

        System.out.println(sumint);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(average);
        System.out.println(min);
        System.out.println(max);
     
    }

    private static int abs(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abs'");
    }

}
