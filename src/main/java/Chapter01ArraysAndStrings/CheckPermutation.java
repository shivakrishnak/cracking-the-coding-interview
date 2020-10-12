package Chapter01ArraysAndStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;

//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other
public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(check("well", "hello world"));
    }

    private static boolean check(String subStr, String mainStr) {
        HashSet mainSet = new HashSet();
        char[] mainArray = mainStr.toCharArray();
        for (char ch: mainArray) {
            mainSet.add(ch);
        }
        char[] charArray = subStr.toCharArray();
        for (char ch: charArray) {
            if(!mainSet.contains(ch))
                return false;
        }
        return true;
    }
}
