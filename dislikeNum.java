//Class: APCSA
/*Name: Mia Dela Cruz
 * Date: 9/9/24
 * Assignment: dislikeNum
 */

import java.util.*;

public record dislikeNum() {
    public static void main(String[] args)
    {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number you don't like that is between 1 ad 9");


    int dislikenum = input.nextInt();
    int numtimesnine = (dislikenum) * 9;
    int finalnum = (dislikenum * 9) *12345679;

   
    System.out.println("x9");
    System.out.println(numtimesnine);
    System.out.println("x12345679");
    System.out.println(finalnum);

}

}
