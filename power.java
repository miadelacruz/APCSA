import java.util.*;

public record power() {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the electricity used (kilowatt hours)");


        int electricity = input.nextInt();
        double baserate = (0.0475 * electricity);
        double surcharge = baserate * 0.1;
        double utiltax = baserate * 0.03;
        double total = baserate + surcharge + utiltax;
        System.out.println("Here is your electric bill");
        System.out.println("You reported your KWH for this month is" + electricity);
        System.out.println("Base Rate @" + baserate);
        System.out.println("Surcharge" + surcharge);
        System.out.println("City utility tax" + utiltax);
        System.out.println("Total" + (baserate + surcharge + utiltax));
        System.out.println("If paid after the deadline, Total= " + (total*1.04));

    }

}
