import java.util.*;

public class Problem49 {
  public static void main(String[] args) {

    List<Integer> primes = new ArrayList<>();

    for (int i = 1000; i < 10000; i++) {
      if (isPrime(i)) {
        primes.add(i);
      }
    }

    for (int i = 0; i < primes.size(); i++) {
      for (int j = i + 1; j < primes.size(); j++) {

        int a = primes.get(i);
        int b = primes.get(j);
        int diff = b - a;
        int c = b + diff;

        if (c < 10000 && isPrime(c)) {

          if (isPermutation(a, b) && isPermutation(a, c)) {

            // skip known example
            if (a == 1487) continue;

            System.out.println("Answer: " + "" + a + b + c);
          }
        }
      }
    }
  }

  static boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return false;
    }

    return true;
  }

  static boolean isPermutation(int a, int b) {

    char[] x = String.valueOf(a).toCharArray();
    char[] y = String.valueOf(b).toCharArray();

    Arrays.sort(x);
    Arrays.sort(y);

    return Arrays.equals(x, y);
  }
}
