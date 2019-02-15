package io.github.omijn.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookAndSayTest {

    @Test
    void solution() {
        assertEquals("1113213211", LookAndSay.solution(8));
    }
}