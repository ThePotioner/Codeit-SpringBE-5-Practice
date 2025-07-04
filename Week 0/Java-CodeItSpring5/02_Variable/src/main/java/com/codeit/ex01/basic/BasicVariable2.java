package com.codeit.ex01.basic;

public class BasicVariable2 {
    public static void main(String[] args) {
        byte byteValue = 127; // signed 8-bit
        short shortValue = 32767; // signed 16-bit
        int intValue = 2147473647; // signed 32-bit
        long longValue = 100000L; // signed 64-bit

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);

        float floatValue = 3.14159265358979323846F; // single-precision 64-bit IEEE 754 floating point
        double doubleValue = 3.14159265358979323846; // double-precision 64-bit IEEE 754 floating point
        // 부동소수점 연산 차이

        System.out.println(floatValue);
        System.out.println(doubleValue);

        float testFloat = 0.1F + 0.2F;
        double testDouble = 0.1 + 0.2;

        System.out.println(testFloat);
        System.out.println(testDouble);

        char charValue = 'A';
        System.out.println(charValue);
        System.out.println((int)charValue); // ASCII "A" : 65

        final int constValue = 1;
        System.out.println(constValue);


    }
}
