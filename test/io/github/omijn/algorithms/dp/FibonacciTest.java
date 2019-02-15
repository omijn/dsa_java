package io.github.omijn.algorithms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void nthRecursive() {
        assertEquals(0, Fibonacci.nthRecursive(0));
        assertEquals(1, Fibonacci.nthRecursive(1));
        assertEquals(55, Fibonacci.nthRecursive(10));
        assertEquals(39088169, Fibonacci.nthRecursive(38));
        assertEquals(701408733, Fibonacci.nthRecursive(44));
        assertEquals(1836311903, Fibonacci.nthRecursive(46));
    }

    @Test
    void nthDPR() {
        assertEquals(0, Fibonacci.nthDPR(0));
        assertEquals(1, Fibonacci.nthDPR(1));
        assertEquals(55, Fibonacci.nthDPR(10));
        assertEquals(39088169, Fibonacci.nthDPR(38));
        assertEquals(701408733, Fibonacci.nthDPR(44));
        assertEquals(1836311903, Fibonacci.nthDPR(46));
    }

    @Test
    void nthDPI() {
        assertEquals(0, Fibonacci.nthDPI(0));
        assertEquals(1, Fibonacci.nthDPI(1));
        assertEquals(55, Fibonacci.nthDPI(10));
        assertEquals(39088169, Fibonacci.nthDPI(38));
        assertEquals(701408733, Fibonacci.nthDPI(44));
        assertEquals(1836311903, Fibonacci.nthDPI(46));
    }
}