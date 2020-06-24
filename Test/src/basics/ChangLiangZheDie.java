package basics;

/**
 * @author: nc
 * @description： 常量折叠
 *
 * 常量折叠的概念
 *  常量折叠是一种编译器优化技术。
 *  常量折叠主要指的是编译期常量加减乘除的运算过程会被折叠
 */

public class ChangLiangZheDie {
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String c = "hello";
        String d = b + 2;
        String e = c + 2;

        /**
         * 执行编译后的结果
         * String a = "hello2";
         * String b = "hello";
         * String c = "hello";
         * String d = "hello2";
         */

        System.out.println(a == d);
        System.out.println(a == e);

        System.out.println("--------------------");

        String f = "1";
        String g = "2";
        String s1 = "1" + "2";

        /**
         * 编译的后：
         * String s1 = "12";
         */


        int h1 = 4;
        int h2 = 2;
        int h3 = 4-2;
        int h4 = h1 - h2;


    }

}
