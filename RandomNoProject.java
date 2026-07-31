// find out random numbers //

import java.util.Random;
public class RandomNoProject {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 100);
        number2 = random.nextInt(1, 100);
        number3 = random.nextInt(1, 100);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
    
}

