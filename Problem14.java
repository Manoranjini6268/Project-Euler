public class Problem14 {
  public static void main(String[] args) {
    long max = 0;
    int result = 0;

    for (int i = 1; i < 1000000; i++) {
      long n = i;
      int count = 1;

      while (n != 1) {
        if (n % 2 == 0) {
          n = n / 2;
        }
        else {
          n = 3 * n + 1;
        }
        count++;
      }
      
      if (count > max) {
        max = count;
        result = i;
      } 
    }
    System.out.println("Starting number: " + result);
    System.out.println("Chain length: " + max);
  }
}