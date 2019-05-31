import java.util.Arrays;

public class CheckPermutation {
    // Assume case sensitivity and whitespace is significant
    // SORT STRINGS
    public static String sort(String str) {
        char[] characters = str.toCharArray();
        java.util.Arrays.sort(characters);
        return new String(characters);
    }

    public static boolean permutation1(String s, String r) {
        if (s.length() != r.length())
            return false;
        return sort(s).equals(sort(r));
    }

    // EQUAL CHAR COUNT
    public static boolean permutation2(String s, String r) {
        if (s.length() != r.length())
            return false;
        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }
        for (int i = 0; i < r.length(); i++) {
            int c = (int) r.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }
}