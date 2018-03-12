package test;

public class MyMath {

  public static boolean checker(PerformOperation p, int num) {
    return p.check(num);
  }

  public PerformOperation isOdd() {
    return (num) -> num % 2 == 0;
  }

  public PerformOperation isPrime() {
    return (num) -> {
      for (int i = 2; i < Math.sqrt(num); i++) {
        if (num % i == 0) return false;
      }
      return true;
    };
  }

  public PerformOperation isPalindrome() {
    return (number) -> {
      int originalNumber = number;
      int reminder = 0;
      int reversedNumber = 0;

      while (number != 0) {
        reminder = number % 10;
        reversedNumber = (reversedNumber * 10) + reminder;
        number = number / 10;
      }

      return originalNumber == reversedNumber;
    };
  }


}
