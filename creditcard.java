//Class: APCSA
/*Name: Mia Dela Cruz
Date: 9/5/24
Assignment: creditcard */


import java.util.*;

public class creditcard {
   public static void main(String[] args)
   {

   
   Scanner input = new Scanner(System.in);

   System.out.println("Please enter the credit card numbers");
        System.out.println();

        int ccnum1 = input.nextInt();
        int ccnum2 = input.nextInt();
        int ccnum3 = input.nextInt();
        int ccnum4 = input.nextInt();
        int sumccnum = ccnum1 + ccnum2 + ccnum3 + ccnum4;
        int summod = (sumccnum) % 26;

    System.out.print(ccnum1 + " " + ccnum2 + " " + ccnum3 + " " + ccnum4 + " " + summod);

        

    


}

}
