package io.github.omijn.algorithms.recursion;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class T9Test {

    @Test
    void solution() {
        assertTrue(T9.solution("226262").contains("banana"));
        assertTrue(T9.solution("4625").contains("goal"));
        System.out.println(T9.solution("0123"));
    }
}