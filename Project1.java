// import scanner //

import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        // create Scanner object //

        Scanner sc = new Scanner(System.in);
        String name;
        int rollno;

        // input student details //

        System.out.println("Enter Student name: ");
        name = sc.nextLine();

        System.out.println("Enter Student rollno: ");
        rollno = sc.nextInt();

        // input 6 subjects marks //

        int Math;
        int Hindi;
        int SST;
        int English;
        int Science;
        int physical;

        System.out.println("Math: ");
        Math = sc.nextInt();
        System.out.println("Hindi: ");
        Hindi = sc.nextInt();
        System.out.println("English: ");
        English = sc.nextInt();
        System.out.println("SST: ");
        SST = sc.nextInt();
        System.out.println("Science: ");
        Science = sc.nextInt();
        System.out.println("physical: ");
        physical = sc.nextInt();

        // calculate total //

        int Total;

        Total = Math + Hindi + English + SST + Science + physical;

        // calculate average //

        double Average;

        Average = Total / 6.0;

        // calculate percentage //

        double Percentage;

        Percentage = (Total / 600.0) * 100;

        // find grade //

        char grade = ' ';

        if (Percentage >= 95) {
            grade = 'A';
            System.out.println("grade A: ");
        } else if (Percentage >= 85) {
            grade = 'B';
            System.out.println("grade B: ");
        } else if (Percentage >= 65) {
            grade = 'C';
            System.out.println("grade C: ");
        } else if (Percentage >= 50) {
            grade = 'D';
            System.out.println("grade D: ");
        } else if (Percentage >= 40) {
            grade = 'E';
            System.out.println("grade E: ");
        } else if (Percentage >= 30) {
            grade = 'F';
            System.out.println("grade F: ");
        } else {
            grade = 'F';
        }

        // check result //

        String result;

        if (Percentage >= 50) {
            result = "PASS";
            System.out.println("PASS: ");
        } else {
            result = "FAIL";
            System.out.println("FAIL: ");
        }

        // check scholarship //

        String Scholarship = "NO";

        if (Percentage >= 80) {
            Scholarship = "YES";
            System.out.println("YES: "); 
        } else {
            System.out.println("NO: ");
        }

        // input attendence // 

        System.out.print("Enter Attendance Percentage: ");
        int attendance = sc.nextInt();

        // check eligibility //

        if (attendance >= 75){
            System.out.println("Eligible: ");
        } else {
            System.out.println("Not Eligible: ");
        }

        // find highest marks //

        int highest = Math;
        
        if (Math > Science){
            highest = Math;
            System.out.println("Math: ");
        }

        int highest1 = Science;

        if (Science > SST){
            highest1 = Science;
            System.out.println("Science: ");
        }

        int highest2 = Hindi;

        if (Hindi > English){
            highest2 = Hindi;
            System.out.println("Hindi: ");
        } 

        int highest3 = English;

        if (English > physical){
            highest2 = English;
            System.out.println("English: ");
        } 

        int highest4= SST;

        if (SST > Math){
            highest2 = SST;
            System.out.println("SST: ");
        } 

        int highest5 = physical;

        if (physical > Hindi){
            highest2 = physical;
            System.out.println("physical: ");
        } 

        // find lowest marks //

        int lowest = physical;

        if (physical < Hindi){
            lowest = physical;
            System.out.println("physical: ");
        }

        int lowest1 = Math;
        
        if (Math < Science){
            lowest1 = Math;
            System.out.println("Math: ");
        }

        int lowest2 = Science;

        if (Science < SST){
            lowest2 = Science;
            System.out.println("Science: ");
        }

        int lowest3 = Hindi;

        if (Hindi < English){
            lowest3 = Hindi;
            System.out.println("Hindi: ");
        } 

        int lowest4 = English;

        if (English < physical){
            lowest4 = English;
            System.out.println("English: ");
        } 

        int lowest5 = SST;

        if (SST < Math){
            lowest5 = SST;
            System.out.println("SST: ");
        } 

        System.out.println("========== REPORT CARD ==========");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollno);

        System.out.println("Math : " + Math);
        System.out.println("Science : " + Science);
        System.out.println("English : " + English);
        System.out.println("Hindi : " + Hindi);
        System.out.println("SST : " + SST);
        System.out.println("physical : " + physical);



        System.out.println("Total : " + Total);
        System.out.println("Average : " + Average);
        System.out.println("Percentage : " + Percentage);

        System.out.println("Grade : " + grade);
        System.out.println("Result : " + result);

        System.out.println("Highest : " + highest);
        System.out.println("Lowest : " + lowest);

        System.out.println("Scholarship : " + Scholarship);

    }
    
}
