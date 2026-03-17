package Arrays;
//An Array in Java is a fixed-size collection of elements of the same data type stored in contiguous memory locations.

//Index →   0     1     2     3

// Value → [10]  [20]  [30]  [40]

// Index always starts from 0

// All elements must be same type (int, String, double, etc.)

// Size is fixed after creation(Static)
public class Basic_array {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
      for (int i = 0; i < arr.length; i++) {
        System.out.println(i);
      }
      arr[3] = 20;
      System.out.println("change the index 3: " + arr[3]);
      

    }
}
