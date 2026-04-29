public class Problem37 {
  public static void main(String[] args) {

    int count = 0;
    int sum = 0;
    int num = 11;

    while (count < 11) {

      if (isPrime(num) && isTruncatable(num)) {
        sum += num;
        count++;
      }

      num++;
    }

    System.out.println("The sum of the eleven truncatable primes is: " + sum);
  }

  static boolean isTruncatable(int num) {

    String s = String.valueOf(num);

    for (int i = 1; i < s.length(); i++) {
      int left = Integer.parseInt(s.substring(i));
      if (!isPrime(left)) return false;
    }

    for (int i = s.length() - 1; i > 0; i--) {
      int right = Integer.parseInt(s.substring(0, i));
      if (!isPrime(right)) return false;
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
