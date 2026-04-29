import java.util.Arrays;

public class Problem26 {
  public static void main(String[] args) {
    int maxLength = 0;
    int result = 0;

    for (int i = 1; i < 1000; i++) {
      int length = getRecurringCycleLength(i);
      if (length > maxLength) {
        maxLength = length;
        result = i;
      }
    }

    System.out.println(
        "The value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal"
            + " fraction part is: "
            + result);
  }

  private static int getRecurringCycleLength(int n) {

    if (n == 1) return 0;

    int[] remainders = new int[n];
    Arrays.fill(remainders, -1);

    int value = 1;
    int position = 0;

    while (value != 0 && remainders[value] == -1) {
      remainders[value] = position;
      value = (value * 10) % n;
      position++;
    }

    return value == 0 ? 0 : position - remainders[value];
  }
}
