package stack;

import array.Array;

/**
 * @author: nc
 * @description：
 */

public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    public void ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public void ArrayStack() {
        array = new Array<>();
    }


    @Override
    public int getSzie() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }


    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Stack:");
        str.append("[");
        for (int i = 0 ; i < array.getSize() ; i++) {
            str.append(array.get(i));
            if (i != array.getSize() - 1 ) {
                str.append(",");
            }
        }
        str.append("]");
        return str.toString();
    }


}

class test {
    public static void main(String[] args) {

        ArrayStack<Character> stack = new ArrayStack();
        stack.ArrayStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSzie());
       int a=  stack.getSzie();
        stack.push('{');
        stack.peek();
    }
}
