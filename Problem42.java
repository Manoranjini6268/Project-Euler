import java.nio.file.*;

public class Problem42 {
  public static void main(String[] args) throws Exception {

    String content = Files.readString(Path.of("words.txt"));
    String[] words = content.replace("\"", "").split(",");

    int count = 0;

    for (String word : words) {

      int value = 0;

      for (char c : word.toCharArray()) {
        value += (c - 'A' + 1);
      }

      if (isTriangle(value)) {
        count++;
      }
    }

    System.out.println("The number of triangle words is: " + count);
  }

  static boolean isTriangle(int x) {

    double n = (-1 + Math.sqrt(1 + 8 * x)) / 2;

    return n == (int) n;
  }
}
