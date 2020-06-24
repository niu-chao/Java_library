package stack;

/**
 * 栈的接口
 */

public interface Stack<E> {

    /**
     * 获取栈中的元素
     */
    int getSzie() ;

    /**
     * 判断是否为空
     */
    boolean isEmpty();

    /**
     * 存放元素
     */
    void push(E e);

    /**
     * 出栈
     */
    E pop();

    /**
     * 获取栈顶元素
     */
    E peek();

}
