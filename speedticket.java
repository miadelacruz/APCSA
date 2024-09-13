//Class: APCSA
/*Name: Mia Dela Cruz
*Date: 9/11/24
*Assignment: divideBill
 */
import java.util.*;


public record speedticket() {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the speed limit");   
        System.out.println ("Please enter your speed");

        int speedlimit = input.nextInt();
        int myspeed = input.nextInt();
        int speeddiff = Math.abs(myspeed - speedlimit);
        int fine = ((speeddiff * 15) + 50);

        System.out.println(fine);

    }

    private static int abs(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abs'");
    }

}
