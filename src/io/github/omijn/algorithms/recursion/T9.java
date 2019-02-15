package io.github.omijn.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class T9 {
    private static final String[] MAPPING = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> solution(String number) {
        List<String> possibilities = new ArrayList<>();
        helper(number, 0, new char[number.length()], possibilities);
        return possibilities;
    }

    private static void helper(String number, int index, char[] stringSoFar, List<String> possibilities) {
        if (index == number.length())
            possibilities.add(String.valueOf(stringSoFar));
        else {
            String currentMapping = MAPPING[number.charAt(index) - '0'];
            for (int i = 0; i < currentMapping.length(); i++) {
                stringSoFar[index] = currentMapping.charAt(i);
                helper(number, index + 1, stringSoFar, possibilities);
            }
        }
    }


}
