import java.util.Scanner;
public class madlibs {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in an object that a CSG girl would need during the school day");
        String object = input.nextLine();
        System.out.println("Please type in a musical instrument");
        String instrument = input.nextLine();
        System.out.println("Please type in a dessert");
        String dessert = input.nextLine();
        System.out.println("Please type in a snack food");
        String snack = input.nextLine();
        System.out.println("Please type in an animal");
        String animal = input.nextLine();
        System.out.println("Please type in a noun");
        String noun1 = input.nextLine();
        System.out.println("Please type in a number");
        int number = input.nextInt();
        System.out.println("Please type in a number");
        int number2 = input.nextInt();
        System.out.println("Please type in a noun (person, place, or thing)");
        String noun2 = input.next();
        
        System.out.print("If I was Mr. Parsons (Head of Upper School) for the day, I would put " + object + " and " + instrument + " in every room in the school and have the dining room serve " + dessert + " and " + snack + " every day students can bring "  + animal + " and " + noun1 +  " to class."+ " Students would give teachers homework, like " + number + " page long book reports about "  + noun2 + " and "+  number2 + " math problems.");
    }   



}
    
