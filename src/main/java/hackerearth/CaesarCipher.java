package hackerearth;

import java.util.Scanner;


/*Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

        Original alphabet:      abcdefghijklmnopqrstuvwxyz
        Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
        Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

        Input Format

        The first line contains the integer, , the length of the unencrypted string.
        The second line contains the unencrypted string, .
        The third line contains , the number of letters to rotate the alphabet by.

        Constraints

        is a valid ASCII string without any spaces.

        Output Format

        For each test case, print the encoded string.

        Sample Input

        11
        middle-Outz
        2
        Sample Output

        okffng-Qwvb*/


public class CaesarCipher {

    static String caesarCipher(String s, int k) {
        char[] encryptedArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                encryptedArray[i] = (char) getEncryptedCharASCII(s.charAt(i), k);
            } else {
                encryptedArray[i] = s.charAt(i);
            }
        }
        return String.valueOf(encryptedArray);
    }

    private static int getEncryptedCharASCII(char c, int k) {
        int total = c + k;
        int start = Character.isUpperCase(c) ? 65 : 97;
        int diff = total - start;
        return start + (diff % 26);
    }

    private static int getEncryptedCharASCII(int ascii, int k, int upperBoundary, int lowerBoundary) {
        int t1 = ascii + k;
        if (t1 > upperBoundary) {
            int diff = t1 - upperBoundary;
            int mod = diff % 26;
            return lowerBoundary + (mod == 0 ? 26 : mod) - 1;
        } else {
            return t1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
