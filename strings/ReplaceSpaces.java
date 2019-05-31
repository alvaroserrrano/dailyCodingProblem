//Write a method to replace all spaces in a string with '%20'

// 1.Count number of spaces;
// 2.Parse String for each char;

class ReplaceSpaces {
    public static void ReplaceSpace(char[] str, int length) {
        int spaceCount = 0;
        int newLength = 0;
        int i = 0;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = length + spaceCount * 2;
        str[newLength] = '\0';
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 1] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
    }
}