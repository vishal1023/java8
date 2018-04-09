package com.java8.features.example;

public class GarbageCollectionExample {

  GarbageCollectionExample garbageCollectionExample;

  public static void main(String[] args) {

    GarbageCollectionExample garbageCollectionExample1 = new GarbageCollectionExample();
    GarbageCollectionExample garbageCollectionExample2 =  new GarbageCollectionExample();

    garbageCollectionExample1.garbageCollectionExample = garbageCollectionExample2;
    garbageCollectionExample2.garbageCollectionExample = garbageCollectionExample1;

    garbageCollectionExample1 =  null;

    garbageCollectionExample2 =  null;

    Runtime.getRuntime().gc();
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("GarbageCollectionExample.finalize");
    System.out.println("Object garbage collected : " + this);

  }
}
