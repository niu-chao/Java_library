package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

/**
 * @author: nc
 * @description：lambda遍历集合测试
 *
 *
 */

public class ListTest {
    public static void main(String[] args) {

        /**
         * 遍历集合
         * 我们可以调用集合的 public void forEach(Consumer<? super E> action) 方法，
         * 通过 lambda 表达式的方式遍历集合中的元素。以下是 Consumer 接口的方法以及遍历集合的操作。Consumer 接口是 jdk 为我们提供的一个函数式接口。
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 10 , 15 , 20 , 12 , 9);

        //lambda 表达式  方法引用
        list.forEach(System.out :: println);

        System.out.println("----------------");

        list.forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        });

        /**
         * 删除集合中的某个元素
         *
         * 我们通过public boolean removeIf(Predicate<? super E> filter)方法来删除集合中的某个元素，
         * Predicate 也是 jdk 为我们提供的一个函数式接口，可以简化程序的编写。
         */

        list.removeIf(ele -> ele == 7);

        list.forEach(System.out :: print);

        System.out.println("----------------");

        /**
         * 集合内元素的排序'
         * 在以前我们若要为集合内的元素排序，就必须调用 sort 方法，传入比较器匿名内部类重写 compare 方法，我们现在可以使用 lambda 表达式来简化代码。
         */


        /*
        list.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getId()  - o2.getId();
            }
        });
        */


        //重写的compare 方法，o1 - o2 小于，等于或大于时，结果为 负整数，零和正整数
        list.sort((o1 ,o2) -> o1 -o2);

        list.forEach(System.out :: println);


        /**
         * Lambda 表达式中的闭包问题#
         * 这个问题我们在匿名内部类中也会存在，如果我们把注释放开会报错，
         * 告诉我 num 值是 final 不能被改变。这里我们虽然没有标识 num 类型为 final，但是在编译期间虚拟机会帮我们加上 final 修饰关键字。
         */

        System.out.println("----------------");

        int num = 10;

        Consumer<String> consumer = ele -> {
            System.out.println(num);
        };

      // num = num + 2;
        consumer.accept("hello");



    }




}
