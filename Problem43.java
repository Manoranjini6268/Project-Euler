public class Problem43 {

  static long sum = 0;

  public static void main(String[] args) {
    permute("", "0123456789");
    System.out.println("The sum of all sub-string divisible numbers is: " + sum);
  }

  static void permute(String prefix, String remaining) {

    if (remaining.length() == 0) {

      if (isValid(prefix)) {
        sum += Long.parseLong(prefix);
      }
      return;
    }

    for (int i = 0; i < remaining.length(); i++) {

      permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
    }
  }

  static boolean isValid(String s) {

    int[] primes = {2, 3, 5, 7, 11, 13, 17};

    for (int i = 0; i < primes.length; i++) {

      int sub = Integer.parseInt(s.substring(i + 1, i + 4));

      if (sub % primes[i] != 0) return false;
    }

    return true;
  }
}
