package io.github.omijn.algorithms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthBellNumberTest {

    @Test
    void dpTab() {
        assertEquals(2, NthBellNumber.dpTab(2));
        assertEquals(5, NthBellNumber.dpTab(3));
        assertEquals(15, NthBellNumber.dpTab(4));
        assertEquals(52, NthBellNumber.dpTab(5));
    }
}