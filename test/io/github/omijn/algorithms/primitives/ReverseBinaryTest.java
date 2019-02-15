package io.github.omijn.algorithms.primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBinaryTest {

    @Test
    void reverse() {
        assertEquals(80, ReverseBinary.reverse((byte) 10));
        assertEquals(1, ReverseBinary.reverse((byte) 128));
    }
}