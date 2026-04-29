import java.math.BigInteger;

public class Problem25 {
  public static void main(String[] args) {

    BigInteger a = BigInteger.ONE;
    BigInteger b = BigInteger.ONE;
    int index = 2;

    while (b.toString().length() < 1000) {
      BigInteger temp = b;
      b = a.add(b);
      a = temp;
      index++;
    }

    System.out.println(
        "The index of the first term in the Fibonacci sequence to contain 1000 digits is: "
            + index);
  }
}
