package org.example;

import java.math.BigDecimal;

/**
Fibonacci implementation
 */
public class Fibonacci {

    public static void main(String[] args) {

        BigDecimal x = BigDecimal.valueOf(System.currentTimeMillis());

        System.out.println("Number of element in a row: " + GetNFibonacci(5));

        System.out.println("Time complexion (recursion): " + (BigDecimal.valueOf(System.currentTimeMillis()).subtract(x)));

        BigDecimal y = BigDecimal.valueOf(System.currentTimeMillis());

        System.out.println("Number of element in a row: " + GetNFibonacciLoop(5));

        System.out.println("Time complexion (loop): " + (BigDecimal.valueOf(System.currentTimeMillis()).subtract(y)));

    }

    public static long GetNFibonacci(long n) {
        if (n > 1)
            return GetNFibonacci(n - 2) + GetNFibonacci(n - 1); // формула Фибоначчи
        else if (n == 1)
            return 1;
        else
            return 0; // если n==0
    }

    public static long GetNFibonacciLoop(long n) {
        long x = 0;
        long[] array = new long[1000];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = 0;
            } else if (i == 1) {
                array[i] = 1;
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == n) {
                x = array[i];
            } else {
                continue;
            }
        }
        return x;
    }
}