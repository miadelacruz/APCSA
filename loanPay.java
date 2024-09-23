//Class: APCSA
/*Name: Mia Dela Cruz
*Date: 9/11/24
*Assignment: loanPay
 */
import java.util.*;

public record loanPay() {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter amount you want to borrow");
        System.out.println("Please enter the interest rate in percent");
        System.out.println("Please enter number of years to pay back loan");

        int borrowmoney = input.nextInt();
        double interest = input.nextDouble();
        int years = input.nextInt();
        int months = (years * 12);
        double topvalue = Math.pow(1+(interest/1200),months);
        double bottomvalue = (Math.pow(1+(interest/1200),months) - 1);
        double midvalue = (interest/1200);
        double monthlypay = (borrowmoney * midvalue * (topvalue / bottomvalue));
        double totalpay = (monthlypay * 12 * years);


        System.out.printf("%.2f", borrowmoney * midvalue * (topvalue / bottomvalue));
        System.out.println();
        System.out.printf("%.2f", monthlypay * 12 * years);
        System.out.println();
        System.out.printf("%.2f", totalpay - borrowmoney);
        
    }




}
