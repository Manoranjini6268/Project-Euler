public class Problem5 {

  public static void main(String[] args) {
    int k = Integer.MAX_VALUE;

    for (int i = 1; i <= k; i++) {
      boolean found = true;

      for (int j = 1; j <= 20; j++) {
        if (i % j != 0) {
          found = false;
          break;
        }
      }
      
      if (found) {
        System.out.println(
            "The smallest positive number that is evenly divisible by all of the numbers "
                + "from 1 to 20 is " + i);
        break;
      } 
    }
  }
}