package hackerearth;

import java.util.Scanner;

public class KilljeeAndInfiniteString {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Integer numberOfTestCases = Integer.valueOf(scanner.nextLine());

    for (Integer i = 1; i <= numberOfTestCases; i++) {
      String[] inputElementsArray = scanner.nextLine().split(" ");

      Integer B = Integer.valueOf(inputElementsArray[0]);
      if (B < 0 || B > 10) {
        System.out.println(0);
        break;
      }
      Integer P = Integer.valueOf(inputElementsArray[1]);
      Integer X = Integer.valueOf(inputElementsArray[2]);

      if (P < 1 || X < 1 || P >= B || X >= B) {
        System.out.println(0);
        break;
      }

      Long L = Long.valueOf(inputElementsArray[3]);
      Long R = Long.valueOf(inputElementsArray[4]);

      Integer xCount = 0;

      StringBuffer infiniteString = new StringBuffer("");
      Integer j = 0;

      while (xCount <= R) {
        String nextDigit = Integer.toString(j, B);
        if (nextDigit.contains(X + "")) {
          xCount++;
        }
        infiniteString.append(nextDigit);
        j++;
      }

      Integer startIndex = getIndexOf(X, L, infiniteString.toString());
      Integer endIndex = getIndexOf(X, R, infiniteString.toString());

      if (startIndex < 0 || endIndex < 0) {
        System.out.println(0);
        break;
      }

      String subString = infiniteString.substring(startIndex + 1, endIndex);

      Integer finalCount = 0;
      for (int k = 0; k < subString.length(); k++) {
        if (Integer.parseInt(String.valueOf(subString.charAt(k))) == P) {
          finalCount++;
        }
      }

      System.out.println("infiniteString = " + infiniteString);
      System.out.println("subString = " + subString);
      System.out.println(finalCount);
    }

  }

  private static Integer getIndexOf(Integer ele, Long occurence, String str) {
    int count = 0;
    for (Integer i = 0; i < str.length(); i++) {
      if (Integer.parseInt(String.valueOf(str.charAt(i))) == ele) {
        count++;
      }
      if (count == occurence)
        return i;
    }
    return -1;
  }

}
