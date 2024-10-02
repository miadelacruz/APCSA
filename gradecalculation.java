
import java.util.*;

public record gradecalculation() {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number grade in decimal form that you want to know the letter grade of");



        double decgrade = input.nextDouble();

        if (decgrade >= 98.0){
            System.out.println("Your grade is an A+");
        } else if (decgrade>=92 && decgrade<98){
            System.out.println("Your grade is an A");
        } else if (decgrade>=90 && decgrade<92){
            System.out.println("Your grade is an A-");


    } else if (decgrade>=88 && decgrade<90){
        System.out.println("Your grade is a B+");
    } else if (decgrade>=82 && decgrade<88){
        System.out.println("Your grade is a B");

    }else if (decgrade>=80 && decgrade<82){
        System.out.println("Your grade is a B-");

} else if (decgrade>=78 && decgrade<80){
    System.out.println("Your grade is a C+");

}else if (decgrade>=72 && decgrade<78){
    System.out.println("Your grade is a C");

}else if (decgrade>=70 && decgrade<72){
    System.out.println("Your grade is a C-");

}else if (decgrade>=68 && decgrade<70){
    System.out.println("Your grade is a D+");
}else if (decgrade>=62 && decgrade<68){
    System.out.println("Your grade is a D");
}else if (decgrade>=60 && decgrade<62){
    System.out.println("Your grade is a D-");
} else
System.out.println("Your grade is an F");
}
}