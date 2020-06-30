package exceptionTest;

/**
 * @author: nc
 * @description：
 */

public class TestException {
    public static void main(String[] args) {
        int c = 0;
        try {
            int a = 3 , b = 0;

            c = a / b;

            System.out.println("异常后的代码执行了");
        } catch (ArithmeticException e) {
            e.printStackTrace();

            System.out.println("除数不能为零");
        } finally {
            System.out.println("finally中的代码最终都会执行");
        }
        System.out.println("c的最终结果为：" + c);
    }
}
