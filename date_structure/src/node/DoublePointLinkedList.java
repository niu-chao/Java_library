package node;

/**
 * @author: nc
 * @description： 双端链表的具体实现
 */

public class DoublePointLinkedList {
    private Node head;  //头结点
    private Node tail; //尾结点
    private int size;

    private class Node {
        private Object data;
        private  Node next;
        public  Node(Object data) {
            this.data = data;
        }
    }

    public DoublePointLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    //链表头新增节点
    public void addHead(Object data) {
        Node node  =new Node(data);
        if(size == 0) {
            head = node;
            tail = node;
            size ++;
        } else {
            node.next = head;
            head = node;
            size ++;
        }
    }

    //链表尾新增节点
    public void addTail(Object data) {
        Node node = new Node(data);
        if (size == 0) {
            head = node;
            tail = node;
            size ++;
        } else {
            tail.next = node;
            tail = node;
            size ++;
        }
    }

    //删除头部节点，成功返回true
    public boolean deleteHead() {
        if (size == 0) {
            return  false;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size --;
        return true;

    }

    //判断是否为空
    public boolean isEmpty(){
        return  (size == 0);
    }

    //获得链表的节点个数
    public int getSize() {
        return size;
    }

    //显示节点信息
    public void display() {
        if (size > 0) {
            Node node = head;
            int tempSize = size;
            if (tempSize == 1) {
                System.out.println("[" + node.data + "]");
                return;
            }
            while (tempSize > 0) {
                if (node.equals(head)) {
                    System.out.print("[" + node.data + "->");
                } else if (node.next == null) {
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

class doubleTest{
    public static void main(String[] args) {
        DoublePointLinkedList dpl = new DoublePointLinkedList();
        dpl.addHead("A");
        dpl.addHead("B");
        dpl.addHead("C");
        dpl.addHead("D");
        dpl.addHead("E");
        dpl.addHead("F");

        dpl.display();
        System.out.println();
        dpl.addTail("G");
        dpl.display();
        System.out.println();
        System.out.println(dpl.isEmpty());
        System.out.println(dpl.getSize());

        dpl.deleteHead();
        dpl.display();


    }
}
