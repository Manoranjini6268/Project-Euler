public class Problem35 {

  public static void main(String[] args) {

    int limit = 1000000;
    int count = 0;

    for (int i = 2; i < limit; i++) {
      if (isCircularPrime(i)) {
        count++;
      }
    }

    System.out.println("The number of circular primes below " + limit + " is: " + count);
  }

  static boolean isCircularPrime(int num) {

    String s = String.valueOf(num);

    for (int i = 0; i < s.length(); i++) {

      int rotated = Integer.parseInt(s);

      if (!isPrime(rotated)) return false;

      s = s.substring(1) + s.charAt(0);
    }

    return true;
  }

  static boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return false;
    }

    return true;
  }
}
