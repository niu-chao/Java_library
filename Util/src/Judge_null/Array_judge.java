package Judge_null;

/**
 * @author: nc
 * @description：判断数组是否为空
 *
 */

public class Array_judge {
    public static void main(String[] args) {
        String [] array = new String [0];

        if (array != null && array.length > 0 ){
            System.out.println("数组不为空");
        } else {
            System.out.println("数组为空");
        }
    }
}
