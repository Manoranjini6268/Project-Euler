import java.math.BigInteger;
public class Problem15 {
  public static void main(String[] args) {
    BigInteger n = BigInteger.valueOf(40);
    BigInteger r = BigInteger.valueOf(20);

    BigInteger result = factorial(n).divide(factorial(r).multiply(factorial(n.subtract(r))));
    System.out.println("The result is: " + result);
  }

  public static BigInteger factorial(BigInteger n) {
    if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
      return BigInteger.ONE;
    }
    return n.multiply(factorial(n.subtract(BigInteger.ONE)));
  }
}