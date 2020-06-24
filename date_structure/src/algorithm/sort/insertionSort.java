package algorithm.sort;

/**
 * @author: nc
 * @description：插入排序
 *
 * 1. 算法步骤
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 *
 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */

public class insertionSort {
    public  static int[] sort(int arr[]){

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {

            // 记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

        }
        return arr;
    }
    static void printArray(int arr[]){
        System.out.print("排序后的数组：{");

        StringBuffer sbu = new StringBuffer();
        for (int a: arr) {
            sbu.append(a+",");
        }
        String str = sbu.toString();

        System.out.print(str.substring(0,str.length()-1)  +  "}");
    }
    public static void main(String[] args) {

        int  [] arry = {1,2,3,4,45,6,14,51,85,55};
        int [] result = sort(arry);
        printArray(result);

    }
}
