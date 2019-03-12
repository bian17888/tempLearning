package sample10;

/**
 * Created by bian17888 on 2018/7/21.
 */
public class StaticSample {
    public static void main(String[] args) {
        System.out.println("Hello Static Final");
    }
}

//class Foo {
//    static int x;
//
//    public void go() {
//        System.out.println(x);
//    }
//}

//class Foo2 {
//    int x;
//
//    public static void go() {
//        System.out.println(x);
//    }
//}

//class Foo3 {
//    final int x;
//
//    public static void go() {
//        System.out.println(x);
//    }
//}

//class Foo4 {
//    static final int x = 12;
//
//    public void go() {
//        System.out.println(x);
//    }
//}

//class Foo5 {
//    static final int x = 12;
//
//    public void go(final int x) {
//        System.out.println(x);
//    }
//}

// 注意形参+final的用法
class Foo6 {
    int x = 12;

    public static void go(final int x) {
        System.out.println(x);
    }

    public void go2(int x) {
        System.out.println(x);
    }
}