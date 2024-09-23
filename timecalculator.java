import java.util.*;

public record timecalculator() {
    public static void main(String [] args)

    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of seconds as an integer");  
        
        int seconds = input.nextInt();
        int minutes = seconds/60;
        int hours = seconds/3600;
        int days = seconds/86400;
        int displayhours = (seconds - (days*86400))/3600;
        int displayminutes = (seconds - (days*86400) - (displayhours*3600))/60;
        int displayseconds = (seconds - (days *86400) - (displayhours*3600) - (displayminutes*60));

        if (seconds<60){
            System.out.println("seconds=" + seconds);
        } else if (seconds>=60 && seconds<=3599){
            
            System.out.println("minutes=" + displayminutes +"seconds=" + displayseconds);
        } else if (seconds>3600 && seconds<86399){
            System.out.println("hours=" + displayhours + "minutes=" + displayminutes + "seconds=" + displayseconds);
        } else if (seconds>=86400){
            System.out.println("days=" + days + "hours=" + displayhours + "minutes=" + displayminutes + "seconds=" + displayseconds);
        }

            


        

    }
}
