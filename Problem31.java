public class Problem31 {

  public static void main(String[] args) {

    int target = 200;

    int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};

    int[] dp = new int[target + 1];
    dp[0] = 1;

    for (int coin : coins) {
      for (int i = coin; i <= target; i++) {
        dp[i] += dp[i - coin];
      }
    }

    System.out.println("Ways: " + dp[target]);
  }
}
