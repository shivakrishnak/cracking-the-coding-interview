package Chapter01ArraysAndStrings;

import java.util.Arrays;

public class URLify {
    public static void main(String[] args) {
        String input = "  Mr John Smith  ";
        //String input = "M h";
        //System.out.println(apply(input));
        System.out.println(applyWithChar(input));
    }

    private static String applyWithChar(String input) {
        char[] charArray = input.toCharArray();
        int startIndex = 0;
        int endIndex = charArray.length - 1;
        int spaceCount = 0;
        //counting the no of spaces
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ')
                spaceCount++;
        }
        System.out.println(spaceCount);
        int newLength = charArray.length + 2 * spaceCount;
        System.out.println(newLength);
        char[] newCharArray = new char[newLength];
        int j = newLength - 1;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == ' ') {
                newCharArray[j] = '0';
                newCharArray[--j] = '2';
                newCharArray[--j] = '%';
                j--;
            } else {
                newCharArray[j] = charArray[i];
                j--;
            }

        }
        return Arrays.toString(newCharArray);
    }

    private static String apply(String input) {
        return input.trim().replace(" ", "%20");
    }
}
