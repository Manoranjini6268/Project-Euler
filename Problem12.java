public class Problem12 {
  public static void main(String[] args) {
    for (int i = 1; i < Integer.MAX_VALUE; i++) {
      long sum = (long) i * (i + 1) / 2;
      int count = 0;

      for (int k = 1; k * k <= sum; k++) {
        if (sum % k == 0) {
          count += 2;
        }
      }

      if (count > 500) {
        System.out.println("The value of first triangular number to have over five hundred divisors is " + sum);
        break;
      }
    }
  }
}