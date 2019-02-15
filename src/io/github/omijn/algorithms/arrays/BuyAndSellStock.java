package io.github.omijn.algorithms.arrays;

import java.util.List;

public class BuyAndSellStock {
    public static int naiveSolution(int[] arr) {
        int n = arr.length;
        int maxProfit = 0;
        for (int i = 0; i < n - 1; i++) {
            int buy = arr[i];
            for (int j = i + 1; j < n; j++) {
                maxProfit = Math.max(maxProfit, arr[j] - buy);
            }
        }

        return maxProfit;
    }

    public static double optimizedSolution(List<Double> prices) {
        int n = prices.size();
        double minSoFar = Double.MAX_VALUE;
        double maxProfit = 0;
        for (double price: prices) {
            minSoFar = Math.min(minSoFar, price);
            maxProfit = Math.max(maxProfit, price - minSoFar);
        }

        return maxProfit;

    }


}
