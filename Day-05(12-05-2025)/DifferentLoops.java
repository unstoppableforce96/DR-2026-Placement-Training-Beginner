public class DifferentLoops {
  public static void main(String[] args) {
    String[] names = {"apple", "banana", "kiwi"};
    // indices         0          1         2
    // Index Based loop
    System.out.println(names.length);
    for (int i = 0; i < names.length; i++) {
      System.out.print(names[i] + " ");
    }
    System.out.println();

    // Value Based Loop
    // for-each loop
    for (String eachName: names) {
      System.out.println(eachName);
    }
  }
}