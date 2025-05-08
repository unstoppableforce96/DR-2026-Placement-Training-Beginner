import java.util.Scanner;
public class PrimesInRange {
  // Function that verifies if given number is a prime
  static boolean isPrime(int n) {
    int fc = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        fc++;
      }
    }
    if (fc == 2) return true;
    else return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int stop = sc.nextInt();
    for (int i = start; i <= stop; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
