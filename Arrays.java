import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        
        /*int[] marks = new int[3];

        marks[0] = 98;
        marks[1] = 43;
        marks[2] = 67;

       // System.out.println(marks[0]); 
      //  System.out.println(marks[1]);
       // System.out.println(marks[2]);

       for(int i=0; i<3; i++){
        System.out.println(marks[i]);
       } 
    
    // defining an array //

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];

    for(int i=0; i<size; i++){
        numbers[i] = sc.nextInt();
    }

    
    for(int i=0; i<size; i++){
        System.out.println(numbers[i]);

    } */

   // take an array an input from user and search x number and print index //

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];

    for(int i=0; i<size; i++){
        numbers[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    
    for(int i=0; i<numbers.length; i++){
        if(numbers[i] == x) {

        System.out.println("x found at index : " + i);

       }
    }

    }
    
} 
