package queue;

/**
 * @author: nc
 * @description：优先级队列
 */

public class PriorityQue {
    private  int [] prioQueArray;
    private int maxSize;
    private  int nItems;

    public PriorityQue(int s){
        maxSize = s;
        prioQueArray = new int[maxSize];
        nItems = 0;
    }

    //插入数据
    public void insert(int value) {
        int j;
        if (nItems == 0) {
            prioQueArray[nItems++] = value;
        } else {
            j = nItems - 1;
            // 选择排序的方法是插入排序，按照从大到小的顺序排列，越小的越在队列顶端
            while (j >= 0 && value > prioQueArray[j]) {
                prioQueArray[j + 1] = prioQueArray[j];
                j--;
            }
            prioQueArray[j + 1] = value;
            nItems++;
        }
    }

    //移除数据，由于是按照大小顺序排列的，所以移除数据，指针下移
    //被移除的是int类型， 所以不能为null，设置为-1
    public  int remove() {
        int k = nItems - 1;
        int value = prioQueArray[k];
        prioQueArray[k] = -1;
        nItems--;
        return  value;
    }

    //查看优先级最小的元素
    public  int peekMin() {
        return  prioQueArray[nItems-1];
    }

    //判断是否为空
    public boolean isEmpty() {
        return  (nItems == 0);
    }

    //判断是否满了
    public boolean isFull() {
        return (nItems == maxSize);
    }
}


class  Test1{
    public static void main(String[] args) {
        PriorityQue priorityQue = new PriorityQue(3);
        priorityQue.insert(1);
        priorityQue.insert(2);
        priorityQue.insert(3);
        System.out.println(priorityQue.peekMin());


        System.out.println(priorityQue.remove());
        priorityQue.insert(4);
        System.out.println(priorityQue.peekMin());
        System.out.println(priorityQue.isFull());

    }
}
