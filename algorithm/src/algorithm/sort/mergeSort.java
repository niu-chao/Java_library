package algorithm.sort;

import java.util.Arrays;

/**
 * @author: nc
 * @description：
 */

public class mergeSort {

    public  static int[] sort(int arr[]){

        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
    }

    protected static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }

        return result;
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
