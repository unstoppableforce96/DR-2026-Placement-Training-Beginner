import java.util.Scanner;

public class EvenOddDigitCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int evenDigitCount = 0;
    int oddDigitCount = 0;
    while (n > 0) {
      int r = n % 10;
      if (r % 2 == 0) evenDigitCount++;
      else oddDigitCount++;
      n = n / 10;
    }
    System.out.println("Even digits: " + evenDigitCount);
    System.out.println("Odd digits: " + oddDigitCount);
  }
}
