public class while_and_for {
  public static void main(String[] args) {
    // For any loop
    // 1. Initialization part
    // 2. Condition Part
    // 3. Updation (Increment/Decrement Part)
    // while loop
    int i = 1; // initialization
    while (i <= 10) // condition
    {
      System.out.print(i + " ");
      i++; // updating (incrementing by 1)
    }
    System.out.println();
    // In for loop we do all these things in one place
    for (int j = 1; j <= 10; j++) {
      System.out.print(j + " ");
    }
  }
}
