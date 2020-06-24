package list;


import java.util.Stack;

/**
 *  面试：反转链表
 */
public class reverserLinked {

    /**
     * 递归实现反转列表
     * @param node
     * @return
     */
    public Node reverserLinkedList(Node node){
        if (node.getNode() == null || node == null){
            return node;
        }
        Node newdata = reverserLinkedList(node.getNode());
        node.getNode().setNode(node);
        node.setNode(null);
        return newdata;
    }


    /**
     * 递归和栈的逻辑相同
     * 通过栈实现链表的反转
     * @param node
     * @return
     */
    public Node reverserLinkedList2(Node node){
        Stack<Node> nodeStack = new Stack<>();
        Node head = null;
        //存入栈中，模拟递归开始的栈状态
        while (node != null){
            nodeStack.push(node);
            node = node.getNode();
        }
        //特殊处理第一个栈顶元素（也就是反转前的最后一个元素，因为它位于最后，不需要反转，如果它参与下面的while， 因为它的下一个节点为空，如果getNode()， 那么为空指针异常）
        if ((!nodeStack.isEmpty())){
            head = nodeStack.pop();
        }
        //排除以后就可以快乐的循环
        while (!nodeStack.isEmpty()){
            Node tempNode = nodeStack.pop();
            tempNode.getNode().setNode(tempNode);
            tempNode.setNode(null);
        }
        return head;
    }


}
