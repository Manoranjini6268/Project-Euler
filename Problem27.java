public class Problem27 {
  public static void main(String[] args) {
    int maxCount = 0;
    int bestA = 0;
    int bestB = 0;

    for (int a = -999; a < 1000; a++) {
      for (int b = -1000; b <= 1000; b++) {

        int n = 0;

        while (true) {
          int value = n * n + a * n + b;

          if (!isPrime(value)) break;

          n++;
        }

        if (n > maxCount) {
          maxCount = n;
          bestA = a;
          bestB = b;
        }
      }
    }

    System.out.println("a = " + bestA);
    System.out.println("b = " + bestB);
    System.out.println("Product = " + (bestA * bestB));
  }

  static boolean isPrime(int num) {
    if (num < 2) return false;

    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) return false;
    }

    return true;
  }
}
