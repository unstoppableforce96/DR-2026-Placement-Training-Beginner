import java.util.Scanner;
public class MaxAndMinOfArray {
  static int getMax(int[] A, int n) {
    int max = A[0];
    for (int i = 1; i < n; i++) {
      if (A[i] > max) {
        max = A[i];
      }
    }
    return max;
  }
  static int getMin(int[] A, int n) {
    int min = A[0];
    for (int i = 1; i < n; i++) {
      if (A[i] < min) {
        min = A[i];
      }
    }
    return min;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }
    System.out.println("Maximum value is: " + getMax(A, n));
    System.out.println("Minimum value is: " + getMin(A, n));
  }
}
