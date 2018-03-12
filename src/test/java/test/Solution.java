package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
//  public static void main(String[] args) throws IOException {
//    MyMath ob = new MyMath();
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int T = Integer.parseInt(br.readLine());
//    PerformOperation op;
//    boolean ret = false;
//    String ans = null;
//    while (T-- > 0) {
//      String s = br.readLine().trim();
//      StringTokenizer st = new StringTokenizer(s);
//      int ch = Integer.parseInt(st.nextToken());
//      int num = Integer.parseInt(st.nextToken());
//      if (ch == 1) {
//        op = ob.isOdd();
//        ret = ob.checker(op, num);
//        ans = (ret) ? "ODD" : "EVEN";
//      } else if (ch == 2) {
//        op = ob.isPrime();
//        ret = ob.checker(op, num);
//        ans = (ret) ? "PRIME" : "COMPOSITE";
//      } else if (ch == 3) {
//        op = ob.isPalindrome();
//        ret = ob.checker(op, num);
//        ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
//
//      }
//      System.out.println(ans);
//    }
//  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int lenght = Integer.parseInt(br.readLine());
    int arr[] = Arrays.asList(br.readLine().split(" "))
        .stream().mapToInt(Integer::parseInt).toArray();

    int count = 0;

    //starting point
    for (int i = 0; i < arr.length; i++) {

      //ending point
      for (int j = i; j < arr.length; j++) {
        int total = 0;
        //sub-elements between start and end
        for (int k = i; k <= j; k++) {
          total = total + arr[k];
        }
        if (total < 0) count++;
      }
    }
    System.out.println("count = " + count);
  }
}
