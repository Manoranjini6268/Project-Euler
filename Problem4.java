public class Problem4 {

  public static void main(String[] args) {
    int max = 0;

    for (int i = 999; i >= 100; i--) {
      for (int j = 999; j >= 100; j--) {
        int k = i * j;

        if (isPalindrome(k)) {
          max = Math.max(max, k);
        }
      }   
    }

    System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + max);    
  }
  
  public static boolean isPalindrome(int number) {
    int reverse = 0;
    int k = number;

    while (k > 0) {
      int num = k % 10;
      reverse = reverse * 10 + num;
      k = k / 10;
    }

    return number == reverse;
  }
}