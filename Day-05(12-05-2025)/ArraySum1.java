// Index-Based Looping

import java.util.Scanner;

public class ArraySum1 {
  static int getArraySum(int[] A, int n) {
    int sumOfElements = 0;
    for (int i = 0; i < n; i++) {
      sumOfElements += A[i];
    }
    return sumOfElements;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // Declaration of array
    int[] arr = new int[n];
    // Read array elements
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); // arr[0] = 10, arr[1] = 20, arr[2] = 30
    }
    System.out.println(getArraySum(arr, n));
  }
}
