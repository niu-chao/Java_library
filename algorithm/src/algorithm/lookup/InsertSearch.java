package algorithm.lookup;

/**
 * @author: nc
 * @description：插值查找
 *
 * 基本思想：
 *  基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率。当然，差值查找也属于有序查找。
 */

public class InsertSearch {
    public static void main(String[] args) {
        int [] arry = {1,2,5,6,7,8,10,20,50};


        int result = insertSearch(arry,2,0,arry.length-1);

        System.out.println(result);
    }


    private static int insertSearch(int[] arry, int value, int low , int hight) {
        int mid = low + (value -arry[low]) / (arry[hight] - arry[low]) * (hight - low);
        //System.out.println(mid);

        if (arry[mid] == value) {
            return mid;
        }

        if (arry[mid] > value) {
            return insertSearch(arry , value , low , mid - 1);
        }
        if (arry[mid] < value) {
            return  insertSearch(arry , value , mid + 1 , hight);
        }

        return -1;
    }


}
