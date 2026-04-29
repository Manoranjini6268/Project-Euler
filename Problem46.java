public class Problem46 {
  public static void main(String[] args) {

    int n = 9;

    while (true) {

      if (!isPrime(n)) { // odd composite

        boolean found = false;

        for (int p = 2; p < n; p++) {

          if (isPrime(p)) {

            int remainder = n - p;

            if (remainder % 2 == 0) {

              int k = (int) Math.sqrt(remainder / 2);

              if (2 * k * k == remainder) {
                found = true;
                break;
              }
            }
          }
        }

        if (!found) {
          System.out.println(
              "The smallest odd composite that cannot be written as the sum of a prime and twice a"
                  + " square is: "
                  + n);
          break;
        }
      }

      n += 2;
    }
  }

  static boolean isPrime(int x) {
    if (x < 2) return false;

    for (int i = 2; i * i <= x; i++) {
      if (x % i == 0) return false;
    }

    return true;
  }
}
