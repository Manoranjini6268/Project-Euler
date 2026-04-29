public class Problem48 {
  public static void main(String[] args) {

    long mod = 10000000000L;
    long sum = 0;

    for (int i = 1; i <= 1000; i++) {

      long term = 1;

      for (int j = 0; j < i; j++) {
        term = (term * i) % mod;
      }

      sum = (sum + term) % mod;
    }

    System.out.println("The last ten digits of the sum are: " + sum);
  }
}
