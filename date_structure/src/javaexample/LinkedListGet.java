package javaexample;

import java.util.LinkedList;

/**
 * @author: nc
 * @description：获取链表中的第一个第二个元素
 */

public class LinkedListGet {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("100");
        lList.add("200");
        lList.add("300");
        lList.add("400");
        lList.add("500");
        System.out.println("链表的第一个元素是：" + lList.getFirst());
        System.out.println("链表的最后一个元素是：" + lList.getLast());
    }
}
