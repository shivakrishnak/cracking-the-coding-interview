package Chapter01ArraysAndStrings;

import java.util.HashSet;

//Is Unique: Implement an algorithm to determine if a string has all unique characters.
//What if you cannot use additional data structures?
public class IsUnique {
    public static void main(String[] args) {
        System.out.println(checkWithNoDS("shiva"));
    }

    private static boolean checkWithNoDS(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && i != j)
                    return false;
            }
        }
        return true;
    }

    private static boolean check(String str) {
        HashSet hs = new HashSet();
        for (char s: str.toCharArray()) {
            if (hs.contains(s))
                return false;
            hs.add(s);
        }
        return true;
    }

}
