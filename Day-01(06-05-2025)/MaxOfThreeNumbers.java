import java.util.Scanner;
public class MaxOfThreeNumbers {
  static void maxOfThree(int a, int b, int c) {
    int mot;
    if (a >= b && a >= c) mot = a;
    else if (b >= a && b >= c) mot = b;
    else mot = c;
    System.out.println(mot);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    maxOfThree(a, b, c);
  }
}
