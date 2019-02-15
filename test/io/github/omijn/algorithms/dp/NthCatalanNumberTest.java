package io.github.omijn.algorithms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthCatalanNumberTest {

    @Test
    void recursiveSolution() {
        assertEquals(1, NthCatalanNumber.recursiveSolution(0));
        assertEquals(1, NthCatalanNumber.recursiveSolution(1));
        assertEquals(2, NthCatalanNumber.recursiveSolution(2));
        assertEquals(5, NthCatalanNumber.recursiveSolution(3));
        assertEquals(14, NthCatalanNumber.recursiveSolution(4));
        assertEquals(42, NthCatalanNumber.recursiveSolution(5));
        assertEquals(132, NthCatalanNumber.recursiveSolution(6));
    }

    @Test
    void dpMemo() {
        assertEquals(1, NthCatalanNumber.dpMemo(0));
        assertEquals(1, NthCatalanNumber.dpMemo(1));
        assertEquals(2, NthCatalanNumber.dpMemo(2));
        assertEquals(5, NthCatalanNumber.dpMemo(3));
        assertEquals(14, NthCatalanNumber.dpMemo(4));
        assertEquals(42, NthCatalanNumber.dpMemo(5));
        assertEquals(132, NthCatalanNumber.dpMemo(6));
    }

    @Test
    void dpTab() {
        assertEquals(1, NthCatalanNumber.dpTab(0));
        assertEquals(1, NthCatalanNumber.dpTab(1));
        assertEquals(2, NthCatalanNumber.dpTab(2));
        assertEquals(5, NthCatalanNumber.dpTab(3));
        assertEquals(14, NthCatalanNumber.dpTab(4));
        assertEquals(42, NthCatalanNumber.dpTab(5));
        assertEquals(132, NthCatalanNumber.dpTab(6));
    }

}