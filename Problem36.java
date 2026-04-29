public class Problem36 {

  public static void main(String[] args) {

    int sum = 0;

    for (int i = 1; i < 1000000; i++) {

      if (isPalindrome(String.valueOf(i)) && isPalindrome(Integer.toBinaryString(i))) {

        sum += i;
      }
    }

    System.out.println("The sum of all double-base palindromes below 1000000 is: " + sum);
  }

  static boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;

    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) return false;
      left++;
      right--;
    }

    return true;
  }
}
