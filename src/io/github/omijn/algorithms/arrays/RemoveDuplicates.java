package io.github.omijn.algorithms.arrays;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> fromLinkedList(LinkedList<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int element = iterator.next();
            if (seen.contains(element)) {
                iterator.remove();
            }
            seen.add(element);
        }

        return list;
    }

//    public static List<Integer> fromList(List<Integer> list) {
//
//    }
}
