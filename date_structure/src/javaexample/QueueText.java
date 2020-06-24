package javaexample;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: nc
 * @description：队列
 */

public class QueueText {
    public static void main(String[] args) {
        Queue<String> quen = new LinkedList<String>();
        quen.offer("a");
        quen.offer("b");
        quen.offer("c");
        quen.offer("d");
        quen.offer("e");
        quen.offer("f");

        for (String q:quen) {
            System.out.println(q);
        }
        System.out.println("==========");
        System.out.println("poll=="+quen.poll());//返回第一个元素，并在队列中删除
        for (String q:quen) {
            System.out.println(q);
        }
        System.out.println("==========");
        System.out.println("element="+quen.element());//返回第一个元素
        for(String q : quen){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+quen.peek()); //返回第一个元素
        for(String q : quen){
            System.out.println(q);
        }

    }
}
