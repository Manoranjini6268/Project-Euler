public class Problem47 {
  public static void main(String[] args) {

    int consecutive = 0;
    int n = 2;

    while (true) {

      if (countPrimeFactors(n) == 4) {
        consecutive++;
      } else {
        consecutive = 0;
      }

      if (consecutive == 4) {
        System.out.println(
            "The first of four consecutive integers with four distinct prime factors is: "
                + (n - 3));
        break;
      }

      n++;
    }
  }

  static int countPrimeFactors(int num) {

    int count = 0;
    int temp = num;

    for (int i = 2; i * i <= temp; i++) {

      if (temp % i == 0) {
        count++;

        while (temp % i == 0) {
          temp /= i;
        }
      }
    }

    if (temp > 1) count++;

    return count;
  }
}
