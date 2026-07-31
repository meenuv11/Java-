// compound interest calculator //
import java.util.Scanner;
public class CIcalculatorproject {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double principle;
        double rate;
        int timecompounded;
        int years;
        double amount = 0;

        System.out.println("Enter principle amount: ");
        principle = sc.nextDouble();

        System.out.println("Enter interest rate (in %): ");
        rate = sc.nextDouble() / 100;

        System.out.println("Enter # of times compounded per year: ");
        timecompounded = sc.nextInt();

        System.out.println("Enter # of years: ");
        years = sc.nextInt();

        System.out.println("The amount after: " + years + " is: $ " + amount);
        amount = principle*Math.pow(1 + rate / timecompounded, timecompounded * years);

        sc.close();
    }
    
}
