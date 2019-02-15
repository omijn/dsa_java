package io.github.omijn.algorithms.primitives;

public class ReverseBinary {

    /**
     * Reverse the bits of a short integer
     *
     * @param x
     * @return
     */
    public static short reverse(byte x) {
        byte result = 0;
        for (int i = 0; i < 8; i++) {
            result <<= 1;
            result |= (x & 1);
            x >>>= 1;
        }

        return result;
    }
}
