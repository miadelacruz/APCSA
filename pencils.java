import java.util.*;

public record pencils() {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Thanks for playing the pencils game with me");
        System.out.println("There are 21 pencils. We take turns picking up pencils");
        System.out.println("The person who picks up the last pencil loses");
        int totalpencils = 21;
        int pencils = 1;
        while(totalpencils>1){
            if(totalpencils==1){
                System.out.println("Since there is one left");
                System.out.println("You have to pick it up, so you lose!");
            }
            if(pencils<=4 || pencils>=1){
                System.out.println("Please enter how many pencils (1-4) that you want to pick up");
                int randpencil = (int)(Math.random()*3
                +1);
                pencils = input.nextInt();
                if(pencils<1 || pencils>4){
                    System.out.println("Incorrect option. Try again");
                    pencils = input.nextInt();
                }
                System.out.println("I picked up " + pencils + " pencils");
                System.out.println("Player 2 took " + randpencil + " pencils");
                totalpencils=totalpencils-(pencils+randpencil);
                System.out.println("there are " + totalpencils + " left");
                
            }
            if(pencils<1||pencils>4){
                System.out.println("Incorrect option. Try again");
            }if(totalpencils==1){
                System.out.println("Since there is one left");
                System.out.println("You have to pick it up, so you lose!");
            }
        
      
            
        
                
        
       

}

}
}




        

