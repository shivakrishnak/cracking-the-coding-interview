package Chapter01ArraysAndStrings;

import java.util.Arrays;

public class PalindromePermutation {
    public static void main(String[] args) {
        String input = "Tact Coa";
        System.out.println(check(input));
    }

    private static boolean check(String input) {
        char[] charArray = input.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    swap(charArray, i, j);
                    //System.out.println(Arrays.toString(charArray));
                }
            }
        }
        makeCombinations(charArray);
        return true;
    }

    private static void makeCombinations(char[] charArray) {
        System.out.println(Arrays.toString(charArray));
        int mid = charArray.length / 2;
        for (int i = 1; i < charArray.length; i++) {
            if (i < mid - 1) {
                swap(charArray, i - 1);
                swap(charArray, charArray.length - i - 1);
                System.out.println(Arrays.toString(charArray));
            }
        }
    }

    private static void swap(char[] charArray, int i) {
        char temp = charArray[i + 1];
        charArray[i + 1] = charArray[i];
        charArray[i] = temp;
    }

    private static void swap(char[] charArray, int i, int j) {
        int length = charArray.length;
        int newIndex = length - 1 - i;
        char temp = charArray[j];
        charArray[j] = charArray[newIndex];
        charArray[newIndex] = temp;
    }
}
