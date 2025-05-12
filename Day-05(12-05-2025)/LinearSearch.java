import java.util.Scanner;

public class LinearSearch {
  static int linearSearch(int[] A, int n, int key) {
      for (int i = 0; i < n; i++) {
        if (A[i] == key) return i;
      }
      return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }
    System.out.println("Enter a key to search: ");
    int key = sc.nextInt();
    int result = linearSearch(A, n, key);
    System.out.println(result);
  }
}
