import java.util.Scanner;
public class Weightconversion {
    public static void main(String[] args) {
        
        // weight conversion program //

        Scanner sc = new Scanner(System.in);

        // declare variables //

        double weight;
        double newweight;
        int choice;

        // welcome msg //

        System.out.println("Welcome Weight Conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // prompt for user choice //

        System.out.println("Choose an option");
        choice = sc.nextInt();
        System.out.println(choice);

        // option 1 convert lbs to kgs //

        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("Enter new weight in kgs is: %.2f" + newweight);
        }

        // option 2 convert kgs to lbs //

        if(choice == 2){
            System.out.print("Enter weight in kgs: ");
            weight = sc.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("Enter new weight in lbs is: %.2f" + newweight);
        }
  
        // else print not a valid choice //

        else {
            System.out.println("That was not a valid choice");
        }
        sc.close();
    }
    
}
