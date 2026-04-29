public class Problem38 {

  public static void main(String[] args) {

    int max = 0;

    for (int x = 1; x < 10000; x++) {

      StringBuilder sb = new StringBuilder();

      int n = 1;

      while (sb.length() < 9) {
        sb.append(x * n);
        n++;
      }

      if (sb.length() == 9 && isPandigital(sb.toString())) {

        int num = Integer.parseInt(sb.toString());
        max = Math.max(max, num);
      }
    }

    System.out.println("The largest 1 to 9 pandigital 9-digit number is: " + max);
  }

  static boolean isPandigital(String s) {

    if (s.contains("0")) return false;

    boolean[] seen = new boolean[10];

    for (char c : s.toCharArray()) {
      int digit = c - '0';

      if (seen[digit]) return false;
      seen[digit] = true;
    }

    return true;
  }
}
