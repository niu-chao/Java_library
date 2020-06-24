package queue;

/**
 * @author: nc
 * @description： 单向队列
 */

public class MyQueue {
    private Object [] queArray;
    //队列总大小
    private int maxSize;
    //前端
    private int front;
    //后端
    private int rear;
    //队列中实际元素的个数
    private int nIteams;

    public MyQueue (int s) {
        maxSize = s;
        queArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nIteams = 0;
    }

    //队列中新增数据
    public void insert(int value) {
        if (isFull()) {
            System.out.println("队列已满");
        } else {
            //如果队列尾部指向顶部，那么循环回来，执行队列的第一个元素
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queArray[++rear] = value;
            nIteams++;
        }
    }

    //移除数据
    public Object remove(){
        Object removeValue = null;
        if (!isEmpty()) {
            removeValue = queArray[front];
            queArray[front] = null;
            front++;
            if (front == maxSize) {
                front = 0;
            }
            nIteams--;
            return  removeValue;
        }
        return  removeValue;
    }

    //查看队头数据
    public Object peekFront() {
        return queArray[front];
    }

    //判断队列是否满了
    public boolean isFull() {
        return  (nIteams == maxSize);
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return (nIteams == 0);
    }

    //返回队列的大小
    public int getSize() {
        return  nIteams;
    }
}


class Test{
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(3);
        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);

        System.out.println(myQueue.peekFront());
        myQueue.remove();
        System.out.println(myQueue.peekFront());

        myQueue.insert(4);
        myQueue.insert(5);
        System.out.println(myQueue.peekFront());

    }
}