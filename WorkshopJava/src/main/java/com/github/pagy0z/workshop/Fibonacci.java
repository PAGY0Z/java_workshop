package com.github.pagy0z.workshop;

public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n == 0 || n == 1) {
            System.out.println("Recursive: 1");
            System.out.println("Iterative: 1");
        } else {
            System.out.println("Recursive: " + recursiveFibonnaci(n));
            iterativeFibonnaci(n);
        }
    }
    public static int recursiveFibonnaci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return recursiveFibonnaci(n - 1) + recursiveFibonnaci(n - 2);
    }
    public static void iterativeFibonnaci(int n) {
        int a = 1;
        int b = 1;
        int c = a + b;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Iterative: " + c);
    }
}
