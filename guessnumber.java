
import java.util.*;

public class guessnumber {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
         System.out.println("Thank you for playing a guessing game with me");
         System.out.println("Please enter a two digit number (integer only) between 0 and 100");
        Random rand = new Random();
         int randomnumber = (rand.nextInt((100-0) + 1));
         int number = input.nextInt();
            while(number!=randomnumber){
               if(number<randomnumber){    
            System.out.println("your number is too low. try again");
               }
         if(number>randomnumber){
               System.out.println("your number is too high");
         }
         number = input.nextInt();
      }
         System.out.println("Your guess matched the random number " + randomnumber );
   }}

       
         

    


