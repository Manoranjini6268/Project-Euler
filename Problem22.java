import java.io.*;
import java.util.*;

public class Problem22 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
    String line = reader.readLine();
    String[] names = line.replace("\"", "").split(",");
    Arrays.sort(names);
    long totalvalue = 0;
    for (int i = 0; i < names.length; i++) {
      String name = names[i].trim();
      int value = 0;
      for (int j = 0; j < name.length(); j++) {
        value +=name.charAt(j)-'A' + 1;
      }     
      totalvalue += value * (i + 1);
    }
    System.out.println("The total of all the name scores is: " + totalvalue);
  }
}

