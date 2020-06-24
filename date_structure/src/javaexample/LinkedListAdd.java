package javaexample;

import java.util.LinkedList;

/**
 * @author: nc
 * @description：向链表的第一和最后插入元素
 */

public class LinkedListAdd {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        lList.addFirst("0");
        System.out.println(lList);
        lList.addLast("6");
        System.out.println(lList);
    }
}
