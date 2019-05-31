//there are 3 possible edits on Strings: inser, replace or remove a char.
//given 2 strings, check if they are one edit away
// pale, ple-->true
// pales, pale-->true
// pale, bale-->true,
// pale, bae-->false
//REPLACE: Different in one place
//INSERTION: Identical except for a shift
//REMOVAL: Inverse of insertion
public class StringEditor {
    boolean oneEditAway(String s, String r) {
        if (s.length() == r.length()) {
            return oneEditReplace(s, r);
        } else if (s.length() + 1 == r.length()) {
            return oneEditInsert(s, r);
        } else if (s.length() - 1 == r.length()) {
            return oneEditInsert(r, s);
        }
        return false;
    }

    boolean oneEditReplace(String s, String r) {
        boolean areDifferent = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != r.charAt(i)) {
                if (areDifferent) {
                    return false;
                }
                areDifferent = true;
            }
        }
        return true;
    }

    boolean oneEditInsert(String s, String r) {
        int indexS = 0;
        int indexR = 0;
        while (indexS < s.length() && indexR < r.length()) {
            if (s.charAt(indexS) != r.charAt(indexR)) {
                if (indexS != indexR) {
                    return false;
                }
                indexR++;
            } else {
                indexS++;
                indexR++;
            }
        }
        return true;
    }
}