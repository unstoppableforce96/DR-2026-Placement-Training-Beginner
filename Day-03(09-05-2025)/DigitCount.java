import java.util.Scanner;

public class DigitCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digitCount = 0;
    while (n > 0) {
      digitCount++;
      n = n / 10;
    }
    System.out.println("Digit Count: " + digitCount);
  }
}