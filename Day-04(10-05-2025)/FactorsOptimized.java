import java.util.Scanner;
public class FactorsOptimized {
  public static void printFactors(int n) {
    // Using Sqrt() logic to find the factors
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        // We found 2 factors (i and n / i)
        if (i != n / i) 
          System.out.println(i + " " + n / i);
        else
          System.out.println(i + " ");
      }
    }
  }
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    printFactors(n);
  }
}
