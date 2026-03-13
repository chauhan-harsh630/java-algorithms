public class Operators {

    // Main method → program execution starts here
    public static void main(String[] args) {

        // Two integer variables
        int a = 8;
        int b = 5;

        // ---------------- Arithmetic Operators ----------------
        System.out.println("Arithmetic Operators");

        // Addition (+)
        // 8 + 5 = 13
        System.out.println("Addition: " + (a + b));

        // Subtraction (-)
        // 8 - 5 = 3
        System.out.println("Subtraction: " + (a - b));

        // Multiplication (*)
        // 8 * 5 = 40
        System.out.println("Multiply: " + (a * b));

        // Division (/)
        // 8 / 5 = 1 (because both are integers, decimal removed)
        System.out.println("Divsion: " + (a / b));

        // Modulus (%) → remainder after division
        // 8 % 5 = 3
        System.out.println("Modules: " + (a % b));


        // ---------------- Assignment Operators ----------------
        System.out.println("Assignment Operators");

        int x = 4;
        int y = 0;

        // += means y = y + x
        // y = 0 + 4
        y += x;

        // Now y = 4
        System.out.println("Assign x value into y: " + y);


        // ---------------- Comparison Operators ----------------
        System.out.println("Comparison Operator");

        int num1 = 20;
        int num2 = 20;

        // == checks equality
        if (num1 == num2) {
            System.out.println("true");  // because both values are same
        }

        int age = 18;

        // >= means greater than OR equal
        if (age >= 18) {
            System.out.println("You can drive");
        }


        // ---------------- Logical Operators ----------------
        System.out.println("Logical Operators");

        int p1_salary = 33000;
        int p2_salary = 34000;

        // && means BOTH conditions must be true
        if (p1_salary == 33000 && p2_salary == 34000) {
            System.out.println("Both Employee has same salary");
        }

        int age1 = 30;
        int age2 = 18;

        // Again using AND
        if (age1 >= 30 && age2 >= 18) {
            System.out.println("Both are adult");
        }


        // ---------------- Ternary Operator ----------------
        int p1 = 18;

        // Ternary operator is a short form of if-else
        // condition ? true_value : false_value

        String result = (p1 >= 18) ? "Adult" : "Minor";

        System.out.println("Result: " + result);


        // ---------------- Bitwise Operators ----------------
        System.out.println("Bitwise Operators");

        int k = 2; // binary = 10
        int l = 4; // binary = 100

        // AND (&)
        // 010
        // 100
        // ----
        // 000 = 0
        System.out.println(k & l);

        // OR (|)
        // 010
        // 100
        // ----
        // 110 = 6
        System.out.println(k | l);

        // NOT (~)
        // Inverts all bits
        System.out.println(~l);

        // Right Shift >>
        // shift bits to right
        System.out.println(k >> l);

        // Left Shift <<
        // shift bits to left
        System.out.println(k << l);

        // XOR ^
        // returns 1 if bits are different
        System.out.println(k ^ l);
    }
}