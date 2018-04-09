package hackerearth;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashSet {

    public static void main(String[] args) {
//    usingPairAndHashSet();
        usingOnlyHashSet();
    }

    private static void usingOnlyHashSet() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }

    }

    private static void usingPairAndHashSet() {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        Set<Pair<String, String>> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        for (int i = 0; i < t; i++) {
            set.add(new Pair<>(pair_left[i], pair_right[i]));
            System.out.println(set.size());
        }
    }
}
