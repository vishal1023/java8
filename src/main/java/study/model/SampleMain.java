package study.model;

import java.util.Optional;

public class SampleMain {

    public static void main(String[] args) {
        Test test = new Test();
        if (Optional.empty().equals(test.sample)) {
            System.out.println(test.sample);
        } else {
            System.out.println(null + " != " + test.sample);
        }


        if(null == null) {
            System.out.println("True");
        }

    }


    static class Test {
        public Optional<String> sample;
    }
}
