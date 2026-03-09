public class Problem6 {
  public static void main(String[] args) {
    int sum1 = 0;

    for (int i = 1; i <= 100; i++) {
      sum1 += i * i;
    }
    int sum2 = 100 * 101 / 2;
    int diff = (sum2 * sum2) - sum1;
    System.out.println(
        "The difference between the sum of the squares of the first one hundred natural numbers "
            + "and the square of the sum is " + diff);
  }
}