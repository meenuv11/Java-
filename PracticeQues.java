/*public class PracticeQues {
    public static void main(String[] args) {
        
        System.out.println("hello world!");
    }
    
} 

public class PracticeQues {

    public static void main(String[] args) {
        
        System.out.println("My Details -");
        System.out.println("My name is :   Meenu");
        System.out.println("I study in :  B.Tech CSE(AIML)");
        System.out.println("My hobbies is :  Savvy");
        System.out.println("My DOB is :  6 Nov 2004");
        System.out.println("I want to become :  SDE at Backend Development");
        
        

    }
} 

import java.util.Scanner;
public class PracticeQues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping numbers");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
        
    }

} 


import java.util.Scanner;
public class PracticeQues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a * b;

        System.out.println("After Swapping numbers");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();

    }

}

import java.util.Scanner;
public class PracticeQues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();

        if(a > b){
            System.out.println(a + " is the largest number.");;
        } else if(a < b){
            System.out.println(b + " is the largest number.");
        } else{
            System.out.println(" both are equals number.");
        }

    }

} 

import java.util.Scanner;
public class PracticeQues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        System.out.println("Enter your third number");
        int c = sc.nextInt();

        if(a >= b && a >= c){
            System.out.println(a + " is the largest number.");;
        } else if(b >= a && b >= c){
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }

        sc.close();

    }
}

import java.util.Scanner;
public class PracticeQues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your  number");
        int num = sc.nextInt();

        if(num % 2 == 0){
           System.out.println(num + " is Even .");
        } else{
           System.out.println(num + " is Odd .");
        }

        sc.close();
    }
} 

import java.util.Scanner;
public class PracticeQues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your  number");
        int num = sc.nextInt();

        if(num > 0){
           System.out.println(num + " is Positive .");
        } else if(num < 0){
            System.out.println(num + " is negative .");
        } else{
           System.out.println(num + " is Zero .");
        }

        sc.close();
    }
} 

import java.util.Scanner;

public class PracticeQues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case '%':
                if (b != 0) {
                    System.out.println("Result = " + (a % b));
                } else {
                    System.out.println("Modulo by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
} */

import java.util.Scanner;

public class PracticeQues  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        sc.close();
    }
}







        

