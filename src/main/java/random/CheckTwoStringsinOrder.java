package random;
//abcdefgh , acdef , u have to find the all the characters in second string are in main string in the same order
public class CheckTwoStringsinOrder {
    public static void main(String[] args) {
        String main  = "abcde";
        String second = "acd";
        System.out.println(check(main,second));
    }

    private static boolean check(String main, String second) {
        char[] mainStr = main.toCharArray();
        char[] secondStr = second.toCharArray();
        int mainArrIndex = 0, secondArrIndex = 0;
        for (int i = 0; i < mainStr.length; i++) {
            System.out.println(secondStr[secondArrIndex] + " --- " + mainStr[mainArrIndex]);
            if(secondStr[secondArrIndex] == mainStr[mainArrIndex]){
                if(mainArrIndex < mainStr.length) mainArrIndex++;
                if(secondArrIndex < secondStr.length) secondArrIndex++;
            } else {
                mainArrIndex++;
            }
        }
        if(mainArrIndex == secondStr.length){
            return true;
        } else {
            return false;
        }
    }
}
