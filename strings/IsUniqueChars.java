// Implement an algorithm to determine if a string has all unique characters What if you can not use additional data structures?
//Asssume alphabet with 128 chars
//Extended ASCII 256 chars
public class IsUniqueChars {
    // time O(n); space O(1)
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128)
            return false;
        boolean[] characters = new boolean[256];
        for (int i = 0; i < characters.length; i++) {
            int val = str.charAt(i);
            if (characters[val])
                return false;
            characters[val] = true;
        }
        return true;
    }

}