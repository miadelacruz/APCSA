import java.util.*;

public record seasons() {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month as an integer");  
        System.out.println("Please enter the day as an integer");  
        int month = input.nextInt();
        int day = input.nextInt();
if (month <= 2 && month>=1){
    System.out.println("Winter");
} else if (month==3 && day<=20){
    System.out.println("Winter");
} else if (month>=3 && day>=21 ){
    System.out.println("Spring");
} else if (month>=4 && month<=5){
    System.out.println("Spring");
} else if (month==6 && day<20){
    System.out.println("Spring");
} else if (month==6 && day>=20 ){
    System.out.println("Summer");
} else if (month>=7 && month<=8){
    System.out.println("Summer");
} else if (month==9 && day<=21){
    System.out.println("Summer");
} else if (month==9 && day>21){
    System.out.println("Autumn");
} else if (month>=10 && month<=11){
    System.out.println("Autumn");
} else if (month==12 && day<=21){
    System.out.println("Autumn");
} else if (month==12 && day>21){
    System.out.println("Winter");
}

    

}
}