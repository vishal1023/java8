package hackerearth;

//Given a String s = "abc" find is all the char's of this string are present in another string
// str = "aflkjkjbwercasdf"

public class CheckIfStringIsPresentInAnotherString {
    public static void main(String[] args) {

        String s = "sdfsdfdz";
        String str = "abcdddadfasdfz";
        boolean flag = false;
        int sStart = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == s.charAt(sStart)) {
                sStart++;
            }
            if (sStart == s.length()) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("\"" + s + "\" is not present in \" " + str + "\"");
        else
            System.out.println("\"" + s + "\" is present in \" " + str + "\"");
    }
}
