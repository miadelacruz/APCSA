import java.util.*;
public record cards() {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
         Random rand = new Random();
         int wins = 0;
         int loses = 0;
         int games = 0;
          while(games<10000){
        int cardsnumber = (rand.nextInt((52-1) + 1));
        if(cardsnumber<13){
             wins++;
            games++;
     }
        if(cardsnumber>=13){
            loses++;
            games++;
        }
         
         }
         System.out.println("Number of games = 10000");
           System.out.println("Wins " + wins);
          System.out.println("Loses " + loses);
         
    }
}





