package io.github.omijn.algorithms.strings;

public class Atoi {
    public static int solution(String sNumber) {
        int num = 0;

        for (int i = 0; i < sNumber.length(); i++) {
            num = num * 10 + (sNumber.charAt(i) - '0');
        }

        return num;
    }
}
