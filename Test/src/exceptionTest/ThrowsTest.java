package exceptionTest;

/**
 * @author: nc
 * @description： 使用throws将异常抛给调用者处理
 *
 * try ..catch 可以保证程序在出现异常的情况下继续执行，
 * 没有try ... catch的话，程序一旦抛出异常就不继续执行了
 *
 *
 * 面试题：Throw 和Throws有什么区别？
 *
 *  Throw语句是用在方法体内表示抛出的异常由方法体内的语句处理
 *
 *  Throws  语句是在方法声明之后抛出异常表示在抛出的异常交给调用者处理
 *
 *  Throws 要么使用try –catch –finally 处理要么继续抛出
 *
 */

public class ThrowsTest {
    public static void main(String[] args) {
        //通过throws将异常抛给调用者处理
        try {
            throwsTest();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("通过throws将异常抛给调用者处理");
        }

        /**
         * 放在上面 throwsTest()方法就不执行了
         */
        //通过throws将异常抛出
        String abc = "abc";
        if ("abc".equals(abc)) {
            throw new NumberFormatException("类型转换错误");
        }

    }

    private static void throwsTest() throws Exception{
        String s = "s";
        System.out.println(Integer.parseInt(s));
    }
}
