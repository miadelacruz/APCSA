import java.util.*;

public record gradecalculationround() {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number grade in decimal form that you want to know the letter grade of");


        double decgrade = input.nextDouble();
        double roundedgrade = Math.round(decgrade);

        if (roundedgrade >= 98.0){
            System.out.println("Your grade is rounded to a " + "" + roundedgrade);
            System.out.println("Your grade is an A+");
        } else if (roundedgrade>=92 && roundedgrade<98){
            System.out.println("Your grade is rounded to a " + "" + roundedgrade);
            System.out.println("Your grade is an A");
        } else if (roundedgrade>=90 && roundedgrade<92){
            System.out.println("Your grade is rounded to a " + "" + roundedgrade);
            System.out.println("Your grade is an A-");


    } else if (roundedgrade>=88 && roundedgrade<90){
        System.out.println("Your grade is rounded to a " + "" + roundedgrade);
        System.out.println("Your grade is a B+");
    } else if (roundedgrade>=82 && roundedgrade<88){
        System.out.println("Your grade is rounded to a " + "" + roundedgrade);
        System.out.println("Your grade is a B");

    }else if (roundedgrade>=80 && roundedgrade<82){
        System.out.println("Your grade is rounded to a " + "" + roundedgrade);
        System.out.println("Your grade is a B-");

} else if (roundedgrade>=78 && roundedgrade<80){
    System.out.println("Your grade is rounded to a " + "" + roundedgrade);
    System.out.println("Your grade is a C+");

}else if (roundedgrade>=72 && roundedgrade<78){
    System.out.println("Your grade is rounded to a " + "" + roundedgrade);
    System.out.println("Your grade is a C");

}else if (roundedgrade>=70 && roundedgrade<72){
    System.out.println("Your grade is rounded to a " + "" + roundedgrade);
    System.out.println("Your grade is a C-");

}else if (roundedgrade>=68 && roundedgrade<70){
    System.out.println("Your grade is rounded to a " + "" + roundedgrade);
    System.out.println("Your grade is a D+");
}else if (roundedgrade>=62 && roundedgrade<68){
    System.out.println("Your grade is rounded to a " + "" + roundedgrade);
    System.out.println("Your grade is a D");
}else if (roundedgrade>=60 && roundedgrade<62){
    System.out.println("Your grade is rounded to a " + "" + roundedgrade);
    System.out.println("Your grade is a D-");
} else
System.out.println("Your grade is an F");
}
}





