package algorithm.sort;

/**
 * @author: nc
 * @description：选择排序
 *
 * 1. 算法步骤
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 *
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *
 * 重复第二步，直到所有元素均排序完毕。
 */

public class selectionSort {
    public  static int[] sort(int arr[]){
        // 总共要经过 N-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
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
