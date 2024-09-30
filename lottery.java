
import java.util.*;

public class lottery {
    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Thanks for playing the lottery with me");
        System.out.println("Please enter a two digit number (integer only) between 10 and 99");

        Random rand = new Random();

        int number = input.nextInt();
        int ones = number%10;
        int tens = (number-ones)/10;

        System.out.println("Your first number is " + tens);
        System.out.println("Your second number is " + ones);
        

       
   

        int randomnumber = (rand.nextInt((99-10) + 1) + 10);
        int randomones = randomnumber%10;
        int randomtens = (randomnumber-randomones)/10;

        System.out.println(randomnumber);

        if (randomnumber == number){
            System.out.println("Your number matched the lottery number so you win $10,000");
        } else if (randomones==tens && randomtens==ones){
            System.out.println("your numbers digits match the lottery number digits so you win $3,000");

        } else if (randomones==tens || randomtens==ones || randomones==ones || randomtens==tens){
            System.out.println("One of your numbers digits matched a lottery number digit so you win $1,000");

        } else{
            System.out.println("Sorry you didn't win :(");
        }

    }

}
