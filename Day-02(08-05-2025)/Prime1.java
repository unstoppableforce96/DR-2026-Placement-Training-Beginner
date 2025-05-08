import java.util.Scanner;
public class Prime1 {
  static int getFactorCount(int n) {
      int fc = 0;
      for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
          fc++;
        }
      }
      return fc;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();
    if (getFactorCount(value) == 2) {
      System.out.println(value + " is a Prime Number");
    }
    else {
      System.out.println(value + " is not a Prime Number");
    }
  }
}