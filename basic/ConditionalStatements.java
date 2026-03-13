import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- SIMPLE IF ----------------
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // If number is positive
        if (num > 0) {
            System.out.println("Number is positive");
        }


        // ---------------- IF - ELSE ----------------
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You can drive");
        } 
        else {
            System.out.println("You cannot drive");
        }


        // ---------------- ELSE IF LADDER ----------------
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 70) {
            System.out.println("Grade: B");
        }
        else if (marks >= 50) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Fail");
        }


        // ---------------- NESTED IF ----------------
        System.out.println("Enter your age again:");
        int age2 = sc.nextInt();

        System.out.println("Do you have a driving license? (true/false)");
        boolean license = sc.nextBoolean();

        // First condition
        if (age2 >= 18) {

            // Second condition inside first
            if (license) {
                System.out.println("You can legally drive");
            } 
            else {
                System.out.println("You need a license to drive");
            }

        } 
        else {
            System.out.println("You are underage");
        }


        // ---------------- TERNARY OPERATOR ----------------
        System.out.println("Enter your age for voting:");
        int voteAge = sc.nextInt();

        // Short form of if-else
        String result = (voteAge >= 18) ? "Eligible to vote" : "Not eligible";

        System.out.println(result);


        // ---------------- SWITCH STATEMENT ----------------
        System.out.println("Enter number between 1-7:");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid input");
        }

        sc.close();
    }
}