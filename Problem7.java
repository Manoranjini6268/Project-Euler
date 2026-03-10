public class Problem7 {
  public static void main(String[] args) {
    int n=Integer.MAX_VALUE;
    int count=0;

    for(int i = 2; i < n; i++) {
      if (isPrime(i)) {
        count++;
      }

      if (count == 10001) {
         System.out.println("The 10001st prime number is " + i);
         break;
      }
    }
  }

  public static boolean isPrime(int number) {
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;   
  }
}