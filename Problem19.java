public class Problem19 {
  public static void main(String[] args) {
    int day = 1;
    int sundaysCount = 0;
    
    for (int year = 1900; year <= 2000; year++) {
      for (int month = 1; month <= 12; month++) {
        if (year > 1900 && day == 0) {
          sundaysCount++;
        }
        int days = daysInMonth(month, year);
        day = (day + days) % 7;
      }
    }
    System.out.println(
        "The number of Sundays that fell on the first of the month during the twentieth century is "
            + sundaysCount);
  }

  public static int daysInMonth(int month, int year) {
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      case 2:
        if (isLeapYear(year)) {
          return 29;
        } else {
          return 28;
        }
      default:
        return 30;
    }
  }
  
  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
  }
}
