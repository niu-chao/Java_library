package node;

/**
 * @author: nc
 * @description：单向链表的实现
 */

public class SingleLinkedList {
    private int size;
    private Node head;

    public SingleLinkedList() {
        size = 0;
        head = null;
    }

    //链表每个节点类
    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }


    //在链表头添加元素
    public Object addHead(Object obj) {
        Node node = new Node(obj);
        if (size == 0) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size ++;
        return obj;
    }


    //删除头元素
    public Object deleteHead() {
        Object obj = head.data;
        head = head.next;
        size --;
        return obj;
    }

    //查找指定元素，找到后返回Node，找不到返回Null
    public Node find(Object obj) {
        Node node = head;
        int tempSize = size;
        while (tempSize > 0) {
            if (obj.equals(node.data)) {
                return node;
            } else {
                node = node.next;
            }
            tempSize --;
        }
        return null;
    }

    //删除指定元素，删除成功返回true
    public boolean delete(Object obj) {
        if (size == 0) {
            return false;
        }
        Node current = head;
        Node previous = head;

        while (current.data != obj) {
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
            }
        }

        //如果删除的是第一个节点
        if (current == head) {
            head = current.next;
            size --;
        } else {
            //当前的下下个赋值给prvious的下一个
            previous.next = current.next;
            size --;
        }
        return true;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return (size == 0);
    }

    //显示节点信息
    public void display() {
        if (size > 0) {
            Node node = head;
            int tempSize = size;
            if (tempSize == 1) {
                System.out.print("[" + node.data + "]");
                return;
            }
            while (tempSize > 0) {
                if (node.equals(head)) {
                    System.out.print("[" + node.data + "->");
                } else if(node.next == null) {
                    System.out.print(node.data + "]");
                } else {
                    System.out.print(node.data + "->");
                }
                node = node.next;
                tempSize --;
            }
        } else {
            System.out.println("[]");
        }
    }
}

class  nodeTest {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addHead("A");
        sll.addHead("B");
        sll.addHead("C");
        sll.addHead("D");
        sll.addHead("E");
        sll.display();
        System.out.println( sll.isEmpty());
        sll.deleteHead();
        sll.display();
        sll.delete("D");
        sll.display();

    }

}
