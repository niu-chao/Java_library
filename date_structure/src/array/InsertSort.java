package array;

public class InsertSort {
    /**
     * 直接插入排序基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
     */

    public static void main(String[] args) {
        int [] array = new int[]{1,5,6,4,87,45,63,78,121,55};
        System.out.println("排序前的数组：");
        outPut(array);
        int [] resultArray = sort(array);
        System.out.println();
        System.out.println("排序后的数组：");
        outPut(resultArray);
    }

    private static void outPut(int[] array) {
        for(int a :array ){System.out.print(a+" ");}
    }

    private static int[] sort(int[] array) {
        int j;
        for (int i = 1 ; i<array.length ; i++){
            //记录要插入的数据
            int temp = array[i];
            j=i;
            //从已经排序的序列最右边的开始比较，找到比其小的数
            // j 经过j--后会改变，最后一行的 array[j] 的J变为确定位置后的j
            while (j>0 && temp < array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }

        return array;
    }
}
