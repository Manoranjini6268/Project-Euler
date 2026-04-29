public class Problem41 {

  static int max = 0;

  public static void main(String[] args) {

    permute("", "7654321");

    System.out.println("Largest pandigital prime: " + max);
  }

  static void permute(String prefix, String remaining) {

    if (remaining.length() == 0) {

      int num = Integer.parseInt(prefix);

      if (isPrime(num)) {
        max = Math.max(max, num);
      }

      return;
    }

    for (int i = 0; i < remaining.length(); i++) {
      permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
    }
  }

  static boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return false;
    }

    return true;
  }
}
