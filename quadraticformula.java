import java.util.*;

public record quadraticformula() {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficient of x squared");
        System.out.println("Enter the coefficient of x");
        System.out.println("Enter the coefficient of the constant");

int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();

double root1 = (-b + Math.sqrt(b^2-4*a*c))/(2*a);
double root2 = (-b - Math.sqrt(b^2-4*a*c))/(2*a);
double root1discrim = Math.sqrt(b^2-4*a*c);
double root2discrim = Math.sqrt(b^2-4*a*c);
       
if (root1discrim >=0) {
    System.out.println("The roots of your quadratic equation are:");
    System.out.println(root1);
   
     
} else 
System.out.println("You have a negative under the square root, Java can't handle. Try again.");


  if (root2discrim >=0){
        System.out.println(root2);
 

    } else
    System.out.println("You have a negative under the square root, Java can't handle. Try again.");

}
}



