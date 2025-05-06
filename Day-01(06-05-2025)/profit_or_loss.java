import java.util.Scanner;
public class profit_or_loss {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int costPrice = sc.nextInt();
    int sellPrice = sc.nextInt();
    if (sellPrice > costPrice) System.out.println("Profit");
    else if (sellPrice < costPrice) System.out.println("Loss");
    else System.out.println("No Profit No Loss");
  }
}