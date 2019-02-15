package io.github.omijn.algorithms.primitives;

public class Parity {

    /**
     * Calculate the parity of a number (1 if number of 1s in binary representation is odd, else 0)
     *
     * @param x
     * @return
     */
    public static int parity(long x) {
        int result = 0;
        while (x != 0) {
            result ^= x & 1;
            x >>>= 1;
        }

        return result;
    }
}
