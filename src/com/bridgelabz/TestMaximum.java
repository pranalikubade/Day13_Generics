package com.bridgelabz;

public class TestMaximum {
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T maxNumber = a;

        if (b.compareTo(maxNumber) > 0)
            maxNumber = b;
        if (c.compareTo(maxNumber) > 0)
            maxNumber = c;

        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(max(4, 3, 2));
        System.out.println(max(5.6, 7.9, 5.7));
        System.out.println(max("Apple", "Peach", "Banana"));
    }
}
