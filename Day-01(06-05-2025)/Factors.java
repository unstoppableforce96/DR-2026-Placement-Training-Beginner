import java.util.Scanner;
public class Factors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int factorSum = 0;
    int factorCount = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " "); // printing factor
        factorSum += i; // adding the factor to factor_sum
        factorCount++; // adding 1 to factorCount upon finding each factor

      }
    }
    System.out.println();
    System.out.println(factorSum);
    System.out.println(factorCount);
  }
}
