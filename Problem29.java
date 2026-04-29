import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Problem29 {
  public static void main(String[] args) {

    Set<BigInteger> set = new HashSet<>();

    for (int a = 2; a <= 100; a++) {
      for (int b = 2; b <= 100; b++) {

        BigInteger base = BigInteger.valueOf(a);
        BigInteger result = base.pow(b);

        set.add(result);
      }
    }

    System.out.println("Distinct terms: " + set.size());
  }
}
