package study;

public interface InterfaceOne {

  default void print(){
    System.out.println("From Interface One");
  }
}
