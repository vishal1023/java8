package study.model;

public class Student {

    private int roll;
    private String name;

    public Student() {
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }
}
