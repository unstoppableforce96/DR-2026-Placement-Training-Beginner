import java.util.Scanner;

public class GCDandLCM1 {
  static int get_lcm(int a, int b) {
    int i = 1, lcm = 1;
    while (true) {
      int current_multiple = a * i;
      if (current_multiple % b == 0) {
        lcm = current_multiple;
        break;
      }
      i++;
    }
    return lcm;
  }
  static int get_gcd(int a, int b) {
    int gcd = 1;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }
  public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    int g = get_gcd(a, b);
    int l = get_lcm(a, b);
    System.out.println("GCD of " + a + ", " + b + " is: " + g);
    System.out.println("LCM of " + a + ", " + b + " is: " + l);
    sc.close();
  }
}
