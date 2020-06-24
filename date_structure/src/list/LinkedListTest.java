package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static javafx.scene.input.KeyCode.L;

public class LinkedListTest {

    /**
     *      链表通常由一连串节点组成，每个节点包含任意的实例数据（data fields）和一或两个用来指向上一个/或下一个节点的位置的链接（"links"）
     *
     *      链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的指针(Pointer)。
     *
     * 　　使用链表结构可以克服数组链表需要预先知道数据大小的缺点，链表结构可以充分利用计算机内存空间，实现灵活的内存动态管理。
     *      但是链表失去了数组随机读取的优点，同时链表由于增加了结点的指针域，空间开销比较大。
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        //声明一个链表
        LinkedList linked = new LinkedList();

        //添加
        linked.add("zhang");
        linked.add(2);
        linked.add("我");

        //是否包含某个元素，包含返回 true；不包含返回false
        System.out.println(linked.contains(2));
        System.out.println(linked.contains(3));


        //获取第一个元素
        System.out.println(linked.element());

        //获取指定位置的元素
        System.out.println(linked.get(1));
        System.out.println(linked.get(0));

        //获取第一个和最后一个元素
        System.out.println( linked.getFirst());
        System.out.println( linked.getLast());


        //判断链表是否为空
        System.out.println(linked.isEmpty());

        //显示第一个元素
        System.out.println(linked.peek());
        //删除并展示第一个元素
        System.out.println(linked.poll());
        System.out.println(linked.element());


        List list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add(33);

        System.out.println(list.contains("11"));
        System.out.println(list.contains(33));

        System.out.println(list.toArray());


        List<String> strlist = new LinkedList<String>();
        strlist.add("1");

    }
}
