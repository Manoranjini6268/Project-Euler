public class Problem33 {

  public static void main(String[] args) {

    int numProduct = 1;
    int denProduct = 1;

    for (int num = 10; num < 100; num++) {
      for (int den = num + 1; den < 100; den++) {

        int a = num / 10;
        int b = num % 10;
        int c = den / 10;
        int d = den % 10;

        if (b == 0 && d == 0) continue;

        if (b == c && d != 0) {

          if (num * d == den * a) {
            numProduct *= num;
            denProduct *= den;
          }
        }
      }
    }

    int gcd = gcd(numProduct, denProduct);

    numProduct /= gcd;
    denProduct /= gcd;

    System.out.println("The denominator of the product is: " + denProduct);
  }

  static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
