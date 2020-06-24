package algorithm.sort;

/**
 * @author: nc
 * @description：快速排序
 *
 * 1. 算法步骤
 * 从数列中挑出一个元素，称为 "基准"（pivot）;
 *
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 *
 * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；
 */

public class quickSort {

    public  static int[] sort(int arr[]){

        return quickSort(arr, 0, arr.length - 1);
    }


    private static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
