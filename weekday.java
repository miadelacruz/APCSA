import java.util.*;



public class weekday{
  public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer from 1 to 7");   
        
      int day = input.nextInt();
      if (day == 1) {
        System.out.println("Sunday");
      } else if (day == 2) {
        System.out.println("Monday");

   } else if (day == 3){
        System.out.println("Tuesday");
        }
     
     else if (day == 4){
        System.out.println("Wednesday");
        
      } else  if (day == 5) {
        System.out.println("Thursday");
        
      } else if (day == 6){
        System.out.println("Friday");
        
      } else if (day == 7) {
        System.out.println("Saturday");
     }

       




    }

}
      