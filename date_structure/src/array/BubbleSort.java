package array;

import java.util.Arrays;

public class BubbleSort {
    /**
     *      冒泡算法的运作规律如下：
     *
     * 　　①、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     *
     * 　　②、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数（也就是第一波冒泡完成）。
     *
     * 　　③、针对所有的元素重复以上的步骤，除了最后一个。
     *
     * 　　④、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */

    public static void main(String[] args) {
        int [] array = new int[]{1,5,6,4,87,45,63,78,121,55};
        System.out.println("排序前的数组：");
        outPut(array);
        int [] resultArray = bubbleSort(array);
        System.out.println();
        System.out.println("排序后的数组：");
        outPut(resultArray);
    }

    private static void outPut(int[] array) {
        for(int a :array ){System.out.print(a+" ");}
    }

    /**
     * //第一个for循环的变量 i 表示总共需要多少轮比较，第二个for循环的变量 j 表示每轮参与比较的元素下标【0,1，......，length-i】，
     *  因为每轮比较都会出现一个最大值放在最右边，所以每轮比较后的元素个数都会少一个，这也是为什么 j 的范围是逐渐减小的。
     * @param array
     * @return
     */
    private static int[] bubbleSort(int[] array) {
        //采用双层for循环的方式进行冒泡排序  从小到大的顺序
        for (int i = 1 ; i<array.length ; i++){
            for(int j = 0 ; j < array.length-i ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return  array;
    }
}
