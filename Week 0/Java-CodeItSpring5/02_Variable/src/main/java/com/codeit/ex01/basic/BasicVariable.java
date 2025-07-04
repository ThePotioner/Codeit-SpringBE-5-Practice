package com.codeit.ex01.basic;

public class BasicVariable {
    static int heapIntVar; // Heap Area | Member Variable, Auto Initialize

    public static void main(String[] args) {
        int stackIntVar = 10; // Stack Area | Available in this Scope, Must be Initialized;
        System.out.println(stackIntVar);
        System.out.println(heapIntVar);

        System.out.println(add(heapIntVar, stackIntVar));
    }

    public static int add(int a, int b) { // Call by Value -> in Stack Area
        return a + b;
    }
}
