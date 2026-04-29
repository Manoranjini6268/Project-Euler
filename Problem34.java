public class Problem34 {

  public static void main(String[] args) {

    int[] fact = new int[10];
    fact[0] = 1;

    for (int i = 1; i <= 9; i++) {
      fact[i] = fact[i - 1] * i;
    }

    int sum = 0;

    for (int i = 3; i <= 2540160; i++) {

      int temp = i;
      int digitSum = 0;

      while (temp > 0) {
        digitSum += fact[temp % 10];
        temp /= 10;
      }

      if (digitSum == i) {
        sum += i;
      }
    }

    System.out.println("The sum of all curious numbers is: " + sum);
  }
}
