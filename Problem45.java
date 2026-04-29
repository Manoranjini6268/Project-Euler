public class Problem45 {
  public static void main(String[] args) {

    long n = 144;

    while (true) {

      long hex = n * (2 * n - 1);

      if (isPentagonal(hex)) {
        System.out.println("The next triangular-pentagonal-hexagonal number is: " + hex);
        break;
      }

      n++;
    }
  }

  static boolean isPentagonal(long x) {

    double n = (1 + Math.sqrt(1 + 24 * x)) / 6;

    return n == (long) n;
  }
}
