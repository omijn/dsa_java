package io.github.omijn.algorithms.strings;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {
    public static String solution(int n) {
        List<String> looksay = new ArrayList<>(n + 1);
        looksay.add("0");
        looksay.add("1");

        for (int i = 2; i <= n; i++) {
            String prev = looksay.get(i - 1);
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while (j < prev.length()) {
                int count = 1;
                int digit = prev.charAt(j);

                while (j + 1 < prev.length() && (prev.charAt(j + 1) == digit)) {
                    count++;
                    j++;
                }

                j++;
                sb.append(count);
                sb.append(digit - '0');
            }

            looksay.add(sb.toString());
        }

        return looksay.get(n);
    }
}
