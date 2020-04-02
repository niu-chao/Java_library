package stack;

import java.util.Stack;

public class StackTest {
    /**
     * 　栈（英语：stack）又称为堆栈或堆叠，栈作为一种数据结构，是一种只能在一端进行插入和删除操作的特殊线性表。
     *  它按照先进后出的原则存储数据，先进入的数据被压入栈底，最后的数据在栈顶，需要读数据的时候从栈顶开始弹出数据（最后一个数据被第一个读出来）。
     *  栈具有记忆作用，对栈的插入与删除操作中，不需要改变栈底指针。
     *
     * 　　栈是允许在同一端进行插入和删除操作的特殊线性表。允许进行插入和删除操作的一端称为栈顶(top)，
     *      另一端为栈底(bottom)；栈底固定，而栈顶浮动；栈中元素个数为零时称为空栈。插入一般称为进栈（PUSH），删除则称为退栈（POP）。
     *
     * 　　由于堆叠数据结构只允许在一端进行操作，因而按照后进先出（LIFO, Last In First Out）的原理运作。栈也称为后进先出表。
     */

    public static void main(String[] args) {
        //声明一个栈
        Stack stack = new Stack();
        //进栈
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push("wo");

        //不删除的情况下，显示栈顶元素
        System.out.println( stack.peek());
        //出栈 删除栈顶元素，并显示之后的栈顶元素
        stack.pop();
        System.out.println( stack.peek());

        //移除指定元素
        System.out.println(stack.remove(2));
        System.out.println( stack.peek());


        //它确定堆栈中是否存在对象。如果找到该元素，它将从堆栈顶部返回元素的位置。否则，它返回-1。,位于栈顶也会返回 -1
        System.out.println(  stack.search(5));
        System.out.println(  stack.search(2));


        //如果堆栈顶部没有任何内容，则返回true。否则，返回false。
        System.out.println(  stack.empty());


    }


}
