import java.util.Scanner;
public class GCDandLCM2 {
  static int getGCD(int a, int b) {
    int common_divisor = 1;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0 && b % i == 0) {
        common_divisor = i;
      }
    }
    return common_divisor;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int gcd = getGCD(a, b);
    int lcm = (a * b) / gcd; // LCM = product / GCD
    System.out.println("LCM is: " + lcm);
    System.out.println("GCD is: " + gcd);
  }
}
