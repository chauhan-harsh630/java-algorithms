// Functions (Methods) in Java

// A function (method) is a block of code that performs a specific task and can be called whenever needed.

// Why functions are important

// Code reuse

// Better program structure

// Easier debugging

// Modular programming

public class Function {
    public static void greet() { //Simple function 
        System.out.println("Hey!!!!");
    }
   
    public static void sayGoodMorning(String name) { // Parameter function 
    System.out.println("Good Morning "+ name);
    }
    
    public static int add(int a, int b) { //Argument function
        return a + b;
    }
     
    public static void main(String[] args) {
        greet();
        int sum = add(10, 4);
        System.out.println("Sum of two number: " + sum);
       sayGoodMorning("Harsh");
    }
}
