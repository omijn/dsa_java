package io.github.omijn.algorithms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthUglyNumberTest {

    @Test
    void solution() {
        assertEquals(6, NthUglyNumber.solution(6));
        assertEquals(1, NthUglyNumber.solution(1));
        assertEquals(2, NthUglyNumber.solution(2));
        assertEquals(3, NthUglyNumber.solution(3));
        assertEquals(4, NthUglyNumber.solution(4));
        assertEquals(5, NthUglyNumber.solution(5));
        assertEquals(8, NthUglyNumber.solution(7));
        assertEquals(9, NthUglyNumber.solution(8));
        assertEquals(10, NthUglyNumber.solution(9));
        assertEquals(12, NthUglyNumber.solution(10));
        assertEquals(15, NthUglyNumber.solution(11));
        assertEquals(16, NthUglyNumber.solution(12));
    }
}