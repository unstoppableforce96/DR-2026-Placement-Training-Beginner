// Index-based loops are helpful when you want to work with not only values but also with indices
import java.util.Scanner;
public class IndexBasedLoop1 {
  static void printEvenNumbersAtEvenIndices1(int[] A, int n) {
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0 && A[i] % 2 == 0) { // Checking both index and value for evenness
        System.out.println(i + " " + A[i]);
      }
    }
  }

  static void printEvenNumbersAtEvenIndices2(int[] A, int n) {
    for (int i = 0; i < n; i += 2) { // Looping through even indices only
      if (A[i] % 2 == 0)
        System.out.println(i + " " + A[i]);
    }
  }
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = read.nextInt();
    }
    printEvenNumbersAtEvenIndices1(A, n);
    printEvenNumbersAtEvenIndices2(A, n);
  }
}
