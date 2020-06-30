package algorithm.lookup;

/**
 * @author: nc
 * @description：顺序查找
 *
 * 顺序查找适合于存储结构为顺序存储或链接存储的线性表。
 *
 * 基本思想：
 *  顺序查找也称为线形查找，属于无序查找算法。从数据结构线形表的一端开始，顺序扫描，
 *  依次将扫描到的结点关键字与给定值k相比较，若相等则表示查找成功；若扫描结束仍没有找到关键字等于k的结点，表示查找失败。
 */

public class sequence {

    public static void main(String[] args) {
        int [] arry = {8,2,6,4,14,9,3,12,20,34,54};
        boolean result = sequenceSearch(arry,20);
        System.out.println(result);
    }

    private static boolean sequenceSearch(int[] arry, int i) {
        for (int a:arry) {
            if (a == i){
                return true;
            }
        }
        return false;
    }
}
