package com.sample7;

/**
 * Created by bian17888 on 2018/7/7.
 */

class ExtendA {
    int ivar = 7;

    void m1() {
        System.out.println("A's m1, ");
    }

    void m2() {
        System.out.println("A's m2, ");
    }

    void m3() {
        System.out.println("A's m3, ");
    }
}

class ExtendB extends ExtendA {
    void m1() {
        System.out.println("B's m1, ");
    }
}

class ExtendC extends ExtendB {
    void m3() {
        System.out.println("C's m3, " + (ivar + 6));
    }
}

public class ExtendSample {
    public static void main(String[] args) {
        ExtendA a = new ExtendA();
        ExtendB b = new ExtendB();
        ExtendC c = new ExtendC();
        ExtendA a2 = new ExtendC();

        a2.m1();
        a2.m2();
        a2.m3();
    }
}