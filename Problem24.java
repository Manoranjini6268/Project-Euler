public class Problem24 {
  public static void main(String[] args) {
    int n = 1000000 - 1;
    StringBuilder sb = new StringBuilder("0123456789");
    StringBuilder result = new StringBuilder();
    
    for (int i = 9; i >= 0; i--) {
      int factorial = factorial(i);
      int index = n / factorial;
      result.append(sb.charAt(index));
      sb.deleteCharAt(index);
      n -= index * factorial;
    }
    
    System.out.println("The 1,000,000th lexicographic permutation is: " + result);
  }

  private static int factorial(int n) {
    if (n == 0) return 1;
    int result = 1;

    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}
