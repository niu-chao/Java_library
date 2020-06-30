package algorithm.lookup;

/**
 * @author: nc
 * @description： 二分查找
 *
 * 元素必须是有序的，如果是无序的则要先进行排序操作。
 *
 * 基本思想：
 *  也称为是折半查找，属于有序查找算法。
 *  用给定值k先与中间结点的关键字比较，中间结点把线形表分成两个子表，若相等则查找成功；
 *  若不相等，再根据k与该中间结点关键字的比较结果确定下一步查找哪个子表，
 *  这样递归进行，直到查找到或查找结束发现表中没有这样的结点。
 *
 * 时间复杂度为O(log2n)
 */

public class BinarySearch {
    public static void main(String[] args) {
        int [] arry = {1,2,5,6,7,8,10,20,50};

        boolean result = binarySearch(arry,2);
        System.out.println(result);
    }

    private static boolean binarySearch(int[] arry, int i) {
        int low = 0;
        int high = arry.length -1;
        int mid;

        while (low < high) {
            //中间值 = 范围内（最小下标 + 最大下标）的一半 ，判断查找的值与中间下标所对应值的大小，来改变最小（大）下标，从而改变中间值
            mid = (low+high) / 2;
            if (i < arry[mid]) {
                high = mid - 1;
            }
            if (i > arry[mid]) {
                low = mid + 1;
            }
            if (i == arry[mid]) {
                return true;
            }
        }

        return  false;
    }
}
