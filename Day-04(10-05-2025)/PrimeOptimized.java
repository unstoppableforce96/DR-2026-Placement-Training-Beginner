// Using sqrt() logic for prime check
// Optimized Version
import java.util.Scanner;
public class PrimeOptimized {
  static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= (int)Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (isPrime(n)) {
      System.out.println(n + " is a prime");
    }
    else {
      System.out.println(n + " is not a prime");
    }
  }
}
