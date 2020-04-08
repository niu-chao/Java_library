package linkedlist;

/**
 * 链表
 */
public class Node {
    //链表用于存储值
    private final int value;
    //指向下一个节点  理解为Node next更加恰当
    private Node node;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
