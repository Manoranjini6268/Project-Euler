import java.util.ArrayList;

public class Problem23 {
  public static void main(String[] args) {
    ArrayList<Integer> abundantNumbers = new ArrayList<>();
    for (int i = 1; i < 28123; i++) {
      if (isAbundant(i)) {
        abundantNumbers.add(i);
      }
    }
    int sum = 0;
    boolean[] abundant = new boolean[28123];
    for (int i = 0; i < abundantNumbers.size(); i++) {
      for (int j = 0; j < abundantNumbers.size(); j++) {
        int abundantSum = abundantNumbers.get(i) + abundantNumbers.get(j);
        if (abundantSum < 28123) {
          abundant[abundantSum] = true;
        }
      }
    }
    for (int i = 1; i < abundant.length; i++) {
      if (!abundant[i]) {
        sum += i;
      }
    }
    System.out.println(
        "The sum of all the positive integers which cannot be written as the sum of two abundant numbers is: " + sum);

  }
  
  public static boolean isAbundant(int n) {
    int sum = 1;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    return sum > n;
  }
}
