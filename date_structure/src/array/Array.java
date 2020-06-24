package array;

/**
 * @author: nc
 * @description： 泛型，动态数组，扩容时，扩为原来的二倍
 */

public class Array<E> {

    private E[] data;
    private int size;

    /**
     * 狗仔函数，传入数组的容量
     * @param capacity
     */
    public Array(int  capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造,默认容量为10
     */
    public Array(){
        this(10);
    }

    /**
     * 获取数组中元素个数
     */
    public int getSize(){
        return size;
    }

    /**
     *
     * 获取数组的容量
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 返回数组是否为空
     */
    public boolean isEmpty(){
        return size == 0;
    }


    /**
     * 向数组最后加元素
     * @param e
     */
    public void addLast(E e){
        add(size,e);
    }


    /**
     * 向数组添加第一个位置的元素
     */

    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 向指定index添加元素
     * @param index
     * @param e
     */
    public void add(int index , E e){
        //判断index是否合法
        if(index < 0 && index > size){
            throw new IllegalAccessError("index id error");
        }

        //判断容量是否超出
        if(size == data.length){
            resize(2 * data.length);
        }

        //将index后面的元素后移
        for(int i = size ; i >= index ; i--){
            data[i+1] = data[i];
        }

        //赋值到index
        data[index] = e;
        size++;
    }

    /**
     * 获取指定位置的值
     * @param index
     * @return
     */
    public E get(int index){
        if(index < 0 && index > size){
            throw new IllegalAccessError("idnex is error");
        }
        return data[index];
    }

    public void set(int index , E e){
        if(index < 0 && index > size){
            throw new IllegalAccessError("idnex is error");
        }
        data[index] = e;
    }

    /**
     * 查找数组中是否有该元素
     */
    public boolean contains(E e){
        for (int i = 0 ; i < size ; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查找元素e在数组中的索引
     * @param e
     * @return
     */
    public int find(E e) {
        for (int i = 0 ; i < size ; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取最后一个元素
     */
    public  E getLast() {
      return get(size - 1);
    }

    /**
     * 删除索引为index的值
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 && index > size) {
            throw new IllegalAccessError("index id error");
        }

        E ret = data[index];

        for (int i = index ; i < size ; i++) {
            data[i] = data[i + 1];
        }
        size --;
        data[size] = null;
        return ret;
    }

    /**
     * 删除第一个元素
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 删除最后一个元素
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除数组中的元素
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("Array:size = %d\n ,capacity = %d\n",size ,data.length));
        str.append("[");
        for (int i = 0 ; i < size ; i++) {
            str.append(data[i]);
            if (i != size - 1) {
                str.append(",");
            }
        }
        str.append("]");
        return str.toString();
    }

    /**
     * 扩容
     */
    private void resize(int newCapacity) {
        E [] newData = (E[]) new Object[newCapacity];
        for (int i = 0 ; i < size ; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

}
