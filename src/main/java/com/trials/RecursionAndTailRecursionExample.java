package com.trials;

public class RecursionAndTailRecursionExample {

  public static void main(String[] args) {

    System.out.println("Fibonacci value = " + fibonacciRecursive(45));
    System.out.println("Fibonacci value = " + fibonacciTailRecursive(100, 0, 1));


    System.out.println("Factorial value = " + factorialRecursion(5));
    System.out.println("Factorial value = " + factorialTailRecursion(5, 1));
  }


  //slower as compare to tail recursion as it creates stack entry every time and which
  private static int fibonacciRecursive(int number) {
    if (number <= 1) return number;
    return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
  }

  //makes it slower as it needs to compute all the values at the end
  private static long fibonacciTailRecursive(long number, long first, long second) {
    if (number == 0) return first;
    if (number == 1) return second;

    return fibonacciTailRecursive(number - 1, second, (first + second));
  }
  //very fast as it doesn't create stack entry every time


  private static int factorialRecursion(int number) {
    if (number == 0) return 1;
    return number * factorialRecursion(number - 1);

  }

  private static int factorialTailRecursion(int number, int result) {
    if (number == 0) return result;
    return factorialTailRecursion(number - 1, number * result);
  }
}
