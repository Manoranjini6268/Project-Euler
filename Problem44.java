public class Problem44 {
  public static void main(String[] args) {

    int limit = 5000;

    long[] pent = new long[limit];

    for (int i = 1; i < limit; i++) {
      pent[i] = i * (3L * i - 1) / 2;
    }

    long minDiff = Long.MAX_VALUE;

    for (int j = 1; j < limit; j++) {
      for (int k = j + 1; k < limit; k++) {

        long sum = pent[j] + pent[k];
        long diff = pent[k] - pent[j];

        if (isPentagonal(sum) && isPentagonal(diff)) {
          minDiff = Math.min(minDiff, diff);
        }
      }
    }

    System.out.println("The minimal difference is: " + minDiff);
  }

  static boolean isPentagonal(long x) {

    double n = (1 + Math.sqrt(1 + 24 * x)) / 6;

    return n == (int) n;
  }
}
