public class Problem30 {
  public static void main(String[] args) {

    int sum = 0;

    for (int i = 2; i <= 354294; i++) {

      int temp = i;
      int digitSum = 0;

      while (temp > 0) {
        int digit = temp % 10;
        digitSum += Math.pow(digit, 5);
        temp /= 10;
      }

      if (digitSum == i) {
        sum += i;
      }
    }

    System.out.println("Sum: " + sum);
  }
}
