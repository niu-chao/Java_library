package javaexample;

/**
 * @author: nc
 * @description：可变参数
 *
 * 定义实参个数可变的方法：只要在一个形参的"类型"与"参数名"之间加上三个连续的"."（即"..."，英文里的句中省略号），就可以让它和不确定个实参相匹配。
 *例：
 * static int  sumvarargs(int... intArrays){}
 */

public class varargsTest {
    static int sum (int... a){
        int sum = 0;
        for (int b:a) {
            sum+=b;
        }
        return sum ;
    }

    public static void main(String[] args) {
        int [] arry = {12,5,8,45};
        int result = sum(arry);
        int result1 = sum(5,6,7);
        System.out.println(result);
    }
}
