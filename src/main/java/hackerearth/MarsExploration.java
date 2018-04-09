package hackerearth;

import java.util.Scanner;

//Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of Sami's SOS have been changed by radiation.
//        Input Format
//        There is one line of input: a single string, .
//
//        Note: As the original MESSAGE is just SOS repeated  times, 's length will be a multiple of .
//
//        Constraints
//
//        will contain only uppercase English letters.
//        Output Format
//
//        Print the number of letters in Sami's MESSAGE that were altered by cosmic radiation.
//
//        Sample Input 0
//
//        SOSSPSSQSSOR
//        Sample Output 0
//
//        3
//        Explanation 0
//
//        = SOSSPSSQSSOR, and signal length . Sami sent  SOS messages (i.e.: ).
//
//        Expected signal: SOSSOSSOSSOS
//        Recieved signal: SOSSPSSQSSOR
//
//        We print the number of changed letters, which is .
//
//        Sample Input 1
//
//        SOSSOT
//        Sample Output 1
//
//        1
//        Explanation 1
//
//        = SOSSOT, and signal length . Sami sent  SOS messages (i.e.: ).
//
//        Expected Signal: SOSSOS
//        Received Signal: SOSSOT
//
//        We print the number of changed letters, which is .
//
//        Easy
//        Submitted 56793 times
//        Max Score 15
//        Need Help?
//
//        View Discussions
//        View Editorial Solution


public class MarsExploration {

    private static final String MESSAGE = "SOS";

    static int marsExploration(String s) {
        int numberOfAlteredChars = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(MESSAGE.charAt(i % 3) == s.charAt(i))) {
                numberOfAlteredChars++;
            }
        }
        return numberOfAlteredChars;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
























