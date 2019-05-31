import java.util.Arrays;

// Decide if 2 strings are anagrams
// An anagram of a string is another string that contains same characters, only the order of characters can be different. 

//1. Sort the Strings
//2. Identical counts for each character

class anagramStrings {
    // 1. Sort the strings
    public static boolean areAnagram1(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2)
            return false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i])
                return false;
        }
        return true;
    }

    // Identical char count
    public static boolean areAnagram2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int[] letters = new int[256];
        int num_unique_chars = 0;
        int num_completed_str2 = 0;
        char[] str1Chars = str1.toCharArray();
        for (char c : str1Chars) {
            if (letters[c] == 0) {
                ++num_unique_chars;
            }
            ++letters[c];
        }
        for (int i = 0; i < str2.length(); i++) {
            int c = (int) str2.charAt(i);
            if (letters[c] == 0) {
                return false;
            }
            --letters[c];
            if (letters[c] == 0) {
                ++num_completed_str2;
                if (num_completed_str2 == num_unique_chars) {
                    return i == str2.length() - 1;
                }
            }
        }
        return false;
    }
}