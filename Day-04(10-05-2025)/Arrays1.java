public class Arrays1 {
  public static void main(String[] args) {
    // Declaration of array
    // datatype[] arrayname = new datatype[size];
    // Array of integers that holds 10 elements
    // int[] arr = new int[10]; // declaration
    // Initialiation of array
    int[] arr = {10, 20, 30, 40, 50};
    // indexes   0   1   2   3   4
    System.out.println(arr[0]); // prints 10
    System.out.println(arr[4]); // prints 50

    // Java offers a way to find the length of array
    // using a length field
    System.out.println(arr.length);
    // How to loop through this array in Java
    // Index-Based loop
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    // Running a for-each loop
    // for (datatype loop_variable: array_name) {
        // block of code
      // } 
      for (int x: arr) {
        System.out.println(x * x);
      }

      // Array of strings
      String[] names = {"Hello", "all", "this", "is", "Pavan"};
      for (String eachName: names) {
        System.out.println(eachName);
      }

      for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
      }
  }
}