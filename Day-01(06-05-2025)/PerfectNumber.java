import java.util.Scanner;

public class PerfectNumber {
  // A function to find the sum of proper factors of n
  public static int getProperFactorSum(int n) {
    int properFactorSum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        properFactorSum += i;
      }
    }
    return properFactorSum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (getProperFactorSum(n) == n) {
      System.out.println(n + " is a perfect number");
    }
    else {
      System.out.println(n + " is not a perfect number");
    }
  }
}
