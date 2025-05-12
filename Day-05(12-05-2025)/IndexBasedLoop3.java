// Index-Based loops are used to travel on array in reverse order too
// Where as Value-Based loop only allows travel in forward direction
public class IndexBasedLoop3 {
  public static void main(String[] args) {
    int[] A = {10, 20, 30, 40, 50};
    for (int i = A.length - 1; i >= 0; i++) {
      System.out.println(A[i] * A[i] + " ");
    }
  }
}
