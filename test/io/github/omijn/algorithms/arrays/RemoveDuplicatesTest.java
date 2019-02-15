package io.github.omijn.algorithms.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void fromLinkedList() {
        assertEquals(new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6)), RemoveDuplicates.fromLinkedList(new LinkedList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 6))));
    }
}