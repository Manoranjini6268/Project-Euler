import java.math.BigInteger;
public class Problem16 {
  public static void main(String[] args) {
    BigInteger num = BigInteger.valueOf(2).pow(1000);
    String numStr = num.toString();
    int sum = 0;

    for (int i = 0; i < numStr.length(); i++) {
      sum += numStr.charAt(i) - '0';
    }
    System.out.println("The sum of the digits is: " + sum);
  }
} 
