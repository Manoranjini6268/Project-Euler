public class Problem10 {
  public static void main(String[] args) {
    int n = 2000000;
    long sum = 0;

    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }
    System.out.println("The sum of all the primes below 2 million is " + sum);
  }

  public static boolean isPrime(int n) {
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
    }
}