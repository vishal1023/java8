package problem;

import java.util.Scanner;
import java.util.Stack;

//    Longest Parentheses Substring
//    You are given a string containing characters '(' and ')'. Print the length of longest valid parentheses substring.
//    Example
//    :
//    Longest valid parentheses substring for "(()" is "()" which has length 2.
//    Longest valid parentheses substring for ")()())" is "()()" which has length 4.
//
//    Input:
//    The only line of input consists of a string containing parentheses.
//
//    Output:
//    Print the length of longest valid parentheses substring.


public class LongestParenthesesSubstring {

  public static void main(String[] args) {
    String input = "{}(()())";

    validStringWithCharStack();
    validStringWithIntegerStack(input);
  }

  public static void validStringWithCharStack() {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      Stack<Character> stack = new Stack<>();
      String input = sc.next();
      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (c == '(' || c == '{' || c == '[') {
          stack.push(c);
        } else {
          if (!stack.empty()) {
            char peek = stack.peek();
            if ((c == ')' && peek == '(') || (c == '}' && peek == '{') || c == ']' && peek == '[') {
              stack.pop();
            } else {
              break;
            }
          } else {
            stack.push(c);
            break;
          }
        }
      }
      if (stack.empty()) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }
    }
  }

  private static void validStringWithIntegerStack(String input) {
    int result = 0;

    Stack<Integer> stack = new Stack<>();
    stack.push(-1);

    for (int i = 0; i < input.length(); i++) {

      if (input.charAt(i) == '(') {
        stack.push(i);
      } else {

        stack.pop();

        if (!stack.isEmpty()) {
          result = Math.max(result, i - stack.peek());
        } else {
          stack.push(i);
        }
      }
    }

    System.out.println("result = " + result);
  }
}
