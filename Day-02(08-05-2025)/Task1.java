import java.util.Scanner;

public class Task1 {

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
    int primes, composites;
    primes = composites = 0;
    for (int i = start; i <= stop; i++) {
      if (isPrime(i)) {
        primes++;
      }
      else {
        composites++;
      }
    }
    System.out.println(Math.abs(primes - composites));
  }
}
