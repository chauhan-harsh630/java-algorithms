//1️⃣ Loops in Java

// A loop is used when you want to execute a block of code multiple times until a condition becomes false.
// It helps avoid writing the same code repeatedly.

// Why loops are useful

// Automate repetitive tasks

// Reduce code duplication

// Process collections or large datasets

// Types of Loops in Java

// for loop

// while loop

// do-while loop

// for-each loop (used with arrays/collections)

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {  //for loop => Used When Number of Itreation is known
            // System.out.println("For Loop " + i);
        }
        int num = 0;
         while (num<=20) {   //While Loop => Used When number Itration is unknown and depends on condtion
            //  System.out.println("While Loop "+ num);
             num++;
         }
        int k = 0;

        do {  //Do-While Loop => This loop always execute even condtion is false.
            // System.out.println("Do-While Loop "+k);
            k++;
        } while (k < 10);
        
        int number[] = {10,20,30,40};
        for (int num2 :number) {   //For-each Loop => Used mainaly on Array and colection.
            System.out.println(num2);
        }
    }
}
