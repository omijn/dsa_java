package io.github.omijn.algorithms.primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParityTest {

    @Test
    void parity() {
        assertEquals(0, Parity.parity(17));
        assertEquals(0, Parity.parity(5));
        assertEquals(1, Parity.parity(4));
        assertEquals(1, Parity.parity(19));
    }
}