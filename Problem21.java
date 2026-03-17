public class Problem21 {
  public static void main(String[] args) {
    int totsum = 0;

    for (int i = 2; i < 10000; i++) {
      int j = sumOfDivisors(i);

      if (i != j && j < 10000 && sumOfDivisors(j) == i) {
        totsum += i;
      }
    }
    System.out.println("The sum of amicable numbers under 10000 is " + totsum);
  }

  public static int sumOfDivisors(int n) {
    int sum = 0;

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
