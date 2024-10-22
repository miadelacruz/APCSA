import java.util.*;

public record rockpaperscissors() {
    public static void main(String [] args)
    {
          Scanner input = new Scanner(System.in);
         System.out.println("Please enter an integer (either 1, 2, or 3) representing");
         System.out.println("1 = Rock");
         System.out.println("2 = Paper");
         System.out.println("3 = Scissors");
        Random rand = new Random();
         int userchoice = input.nextInt();
         int randomnumber = (rand.nextInt((3-1) + 1) + 1);
         System.out.println("You chose " + userchoice);
         System.out.println("Java chose " + randomnumber);
         if (userchoice == 1 && randomnumber == 3){
            System.out.println("Rock beats scissors, so you win!");
         } else if (userchoice == 1 && randomnumber == 2 ){
            System.out.println("Paper beats rock, so you lose");
         } else if (userchoice == 2 && randomnumber == 1){
            System.out.println("Paper beats rock, so you win!");
         } else if (userchoice == 2 && randomnumber ==3){
            System.out.println("Scissors beats paper, so you lose");
         } else if (userchoice == 3 && randomnumber ==1){
            System.out.println("Rock beats scissors, so you lose");
         } else if (userchoice == 3 && randomnumber == 2){
            System.out.println("Scissors beats paper, so you win!");
         } else
         System.out.println("You tied. Try again.");
    }


}
