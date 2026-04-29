public class Problem40 {
  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();

    int num = 1;

    while (sb.length() < 1000000) {
      sb.append(num);
      num++;
    }

    int result =
        (sb.charAt(0) - '0')
            * (sb.charAt(9) - '0')
            * (sb.charAt(99) - '0')
            * (sb.charAt(999) - '0')
            * (sb.charAt(9999) - '0')
            * (sb.charAt(99999) - '0')
            * (sb.charAt(999999) - '0');

    System.out.println("The product of the specified digits is: " + result);
  }
}
