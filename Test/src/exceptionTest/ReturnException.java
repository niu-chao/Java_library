package exceptionTest;

/**
 * @author: nc
 * @description：  finally里有返回的话，会覆盖点catch中的返回
 */

public class ReturnException {

    public static void main(String[] args) {
        int result = test();
        System.out.println("异常return的结果为：" + result);
    }

    public static int test() {
        try {
            System.out.println(9 / 0);
            return 1;
        } catch (Exception e) {
            System.out.println("catch执行了");

            /**
             *  未返回，继续执行finally
             */
            return 2;
        } finally {
            System.out.println("finally执行了");
            return 3;
        }
    }
}
