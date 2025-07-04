package com.codeit.ex04.var;

import java.util.ArrayList;

public class VarPractice {

    public static void main(String[] args) {
        var name = "홍길동"; // String으로 추론
        var age = 25; // int로 추론
        var list = new ArrayList<String>(); // ArrayList<String>으로 추론

        System.out.println(name);
        System.out.println(age + 5);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);


        // 추론이 되지 않아 에러가 발생
        // var x;
        // var result = null;
    }
}