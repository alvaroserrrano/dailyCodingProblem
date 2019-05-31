// 

//TEST CASES
// 1. no duplicates,
// 2. all duplicates,
// 3. null string,
// 4. all continuous duplicates(aaabbb)

class removeDuplicates {
    public static void removeDuplicates(char[] str) {
        if (str == null)
            return;
        int length = str.length;
        if (length < 2)
            return;
        int tail = 1;
        for (int i = 1; i < length; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (str[i] == str[j])
                    break;
            }
            if (j == tail) {
                str[tail] = str[i];
                tail++;
            }
        }
        str[tail] = 0;
    }
}