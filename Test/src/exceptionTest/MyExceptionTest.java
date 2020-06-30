package exceptionTest;

/**
 * @author: nc
 * @description：自定义异常测试
 */

public class MyExceptionTest {
    public static void main(String[] args) throws MyException {
        MyExceptionTest my = new MyExceptionTest();
        my.method();
    }

    void method() throws MyException {
        String str = "2";
        if ("2".equals(str)) {
            throw new  MyException("自定义异常测试");
        }
    }
}
