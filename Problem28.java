public class Problem28 {
  public static void main(String[] args) {
    int n = 1001;
    int[][] grid = new int[n][n];

    int x = n / 2;
    int y = n / 2;

    grid[x][y] = 1;

    int num = 2;
    int step = 1;

    while (step < n) {

      for (int i = 0; i < step; i++) {
        grid[x][++y] = num++;
      }

      for (int i = 0; i < step; i++) {
        grid[++x][y] = num++;
      }

      step++;

      for (int i = 0; i < step; i++) {
        grid[x][--y] = num++;
      }

      for (int i = 0; i < step; i++) {
        grid[--x][y] = num++;
      }

      step++;
    }

    for (int i = 0; i < n - 1; i++) {
      grid[x][++y] = num++;
    }

    long sum = 0;

    for (int i = 0; i < n; i++) {
      sum += grid[i][i];
      sum += grid[i][n - i - 1];
    }

    sum -= 1;

    System.out.println(
        "The sum of the numbers on the diagonals in a 1001 by 1001 spiral is: " + sum);
  }
}
