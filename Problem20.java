import java.math.BigInteger;

public class Problem20 {
  public static void main(String[] args) {
    BigInteger fact = BigInteger.ONE;

    for (int i = 100; i > 0; i--) {
      fact = fact.multiply(BigInteger.valueOf(i));
    }
    
    BigInteger sum = BigInteger.ZERO;

    while (fact.compareTo(BigInteger.ZERO) > 0) {
      sum = sum.add(fact.mod(BigInteger.TEN));
      fact = fact.divide(BigInteger.TEN);
    }

    System.out.println("The sum of digits in 100! is " + sum);
  }
}