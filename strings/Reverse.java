class ReverseString {
    public static void reverse1(String input) {
        byte[] strToBytes = input.getBytes();
        byte[] result = new byte[strToBytes.length];
        for (int i = 0; i < strToBytes.length; i++) {
            result[i] = strToBytes[strToBytes.length - 1 - i];
        }
        System.out.println(new String(result));
    }

    public static void reverse2(String input) {
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1 = input1.reverse();
        System.out.println(input1);
    }

    public static void reverse3(String input) {
        char[] input1 = input.toCharArray();
        for (int i = input1.length - 1; i >= 0; i--) {
            System.out.println(input1[i]);
        }
    }

    public static void reverse4(String input) {
        char[] tempArr = input.toCharArray();
        int left, right = 0;
        right = tempArr.length - 1;
        for (left = 0; left < right; left++, right--) {
            char temp = tempArr[left];
            tempArr[left] = tempArr[right];
            tempArr[right] = temp;
        }
        for (char c : tempArr)
            System.out.println(c);
    }
}
