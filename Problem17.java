public class Problem17 {
  public static void main(String[] args) {
    int[] ones = { 0, 3, 3, 5, 4, 4, 3, 5, 5, 4,
        3, 6, 6, 8, 8, 7, 7, 9, 8, 8 };
    int[] tens = { 0, 0, 6, 6, 5, 5, 5, 7, 6, 6 };
    int count = 0;

    for (int i = 1; i <= 1000; i++) {

      if (i < 20) {
        count += ones[i];
      } else if (i < 100) {
        count += tens[i / 10] + ones[i % 10];
      } else if (i < 1000) {
        count += ones[i / 100] + 7;

        if (i % 100 != 0) {
          count += 3;
          
          if (i % 100 < 20) {
            count += ones[i % 100];
          } else {
            count += tens[i % 100 / 10] + ones[i % 100 % 10];
          }
        }
      } else {
        count += 11;
      }
    }
    System.out.println("Total letters: " + count);        
  }
}
