package io.github.omijn.algorithms.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStockTest {

    @Test
    void naiveSolution() {
        assertEquals(30, BuyAndSellStock.naiveSolution(new int[]{310, 315, 275, 295, 260, 270, 290, 230, 255, 250}));
    }


    @Test
    void optimizedSolution() {
        assertEquals(30d, BuyAndSellStock.optimizedSolution(new ArrayList<>(Arrays.asList(310d, 315d, 275d, 295d, 260d, 270d, 290d, 230d, 255d, 250d))));
    }
}