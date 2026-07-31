import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts;
        int randomnumber = random.nextInt(1,11);

        System.out.println(randomnumber);

    }
    
}
