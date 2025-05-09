import java.util.Scanner;

public class DigitSumProduct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digitSum = 0;
    int digitProduct = 1;
    while (n > 0) {
      int r = n % 10;
      digitProduct *= r;
      digitSum += r;
      n = n / 10;
    }
    System.out.println("Digit Sum: " + digitSum);
    System.out.println("Digit Product: " + digitProduct);
  }
}
