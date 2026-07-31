import java.util.Scanner;

public class Functions {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printFactorial(n);
        double average = calculateAverage(a, b, c);
        System.out.println("Average of 3 numbers: " + average);
    }
}
    

