import java.util.HashSet;
import java.util.Set;

public class Problem32 {

  public static void main(String[] args) {

    Set<Integer> products = new HashSet<>();

    for (int i = 1; i < 100; i++) {
      for (int j = 100; j < 10000; j++) {

        int product = i * j;

        String combined = "" + i + j + product;

        if (combined.length() == 9 && isPandigital(combined)) {
          products.add(product);
        }
      }
    }

    int sum = 0;
    for (int p : products) {
      sum += p;
    }

    System.out.println("The sum of all products is: " + sum);
  }

  static boolean isPandigital(String s) {
    if (s.contains("0")) return false;

    boolean[] seen = new boolean[10];

    for (char c : s.toCharArray()) {
      int digit = c - '0';
      if (seen[digit]) return false;
      seen[digit] = true;
    }

    return true;
  }
}
