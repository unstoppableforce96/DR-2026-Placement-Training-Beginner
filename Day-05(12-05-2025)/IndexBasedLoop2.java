// Index Based loops are helpful to change the value of array
// Value Based loops only brings the copy of value thus by not changing original value
import java.util.Arrays;
public class IndexBasedLoop2 {
  public static void main(String[] args) {
    int[] A = {10, 20, 30, 40};
    for (int eachNumber: A) {
      eachNumber++;
    }
    System.out.println(Arrays.toString(A)); // Values are not changing due to value based looping

    for (int i = 0; i < A.length; i++) {
      A[i]++;
    }
    System.out.println(Arrays.toString(A)); // Values changed due to the usage of index-based looping
  }
}
