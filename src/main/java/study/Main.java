package study;

import study.model.Student;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

//        Student john = null; //new Student(1,  "John");
//        Optional<Student>  student = Optional.ofNullable(john);
//
//        if(student.isPresent())
//        {
//            System.out.println("student = " + student.toString());
//        }else {
//            System.out.println("Student is null" );
//        }

        Derived derived = new Derived();
        derived.print();

        System.out.println(Math.sqrt(41));
    }
}
