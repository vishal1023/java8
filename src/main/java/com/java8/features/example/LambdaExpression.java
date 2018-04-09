package com.java8.features.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaExpression {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    numbers.stream()
        .filter(a -> a < 3)
        .forEach(System.out::println);

    operation(numbers);
  }

  //write a method with lambda expression which adds two numbers
  private static void operation(List<Integer> numbers) {
    Integer sum = 0;
    Optional<Integer> first = numbers.stream()
        .map(e -> e + sum)
        .findFirst();

    System.out.println("sum = " + first);

  }
}
