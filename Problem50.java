import java.util.*;

public class Problem50 {
  public static void main(String[] args) {

    int limit = 1000000;

    List<Integer> primes = new ArrayList<>();
    for (int i = 2; i < limit; i++) {
      if (isPrime(i)) {
        primes.add(i);
      }
    }

    int maxLength = 0;
    int result = 0;

    for (int i = 0; i < primes.size(); i++) {

      for (int j = i; j < primes.size(); j++) {

        int sum = 0;

        for (int k = i; k <= j; k++) {
          sum += primes.get(k);
        }

        if (sum >= limit) break;

        int length = j - i + 1;

        if (isPrime(sum) && length > maxLength) {
          maxLength = length;
          result = sum;
        }
      }
    }

    System.out.println(
        "The sum of the longest sequence of consecutive primes that is itself prime is: " + result);
  }

  static boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return false;
    }

    return true;
  }
}
