package Lambda;

import Lambda.interfaces.*;

/**
 * @author: nc
 * @description：Lambda表达式
 *
 * 语法形式为 () -> {}，其中 () 用来描述参数列表，{} 用来描述方法体，-> 为 lambda运算符 ，读作(goes to)。
 *
 * 有时候我们不是必须要自己重写某个匿名内部类的方法，我们可以可以利用 lambda表达式的接口快速指向一个已经被实现的方法。
 *
 * ​ 方法归属者::方法名 静态方法的归属者为类名，普通方法归属者为对象
 */

public class grammar {
    public static void main(String[] args) {

        //无参无返回
        NoReturnNoParam noReturnNoParam = () -> {
            System.out.println("无参无返回");
        };
        noReturnNoParam.method();

        //一个参数无返回
        NoReturnOneParam noReturnOneParam = (a) -> {
            System.out.println("一个参数无返回:" + a);
        };
        noReturnOneParam.method(2);

        //多个参数无返回
        NoReturnMultiParam noReturnMultiParam =(a,b) -> {
            System.out.println("多个参数无返回：" + a + "," + b);
        };
        noReturnMultiParam.method(2,3);


        //无参有返回
        ReturnNoParam returnNoParam = () -> {
            System.out.println("无参有返回：");
            return 5;
        };
        System.out.println(returnNoParam.method());

        //一个参数有返回
        ReturnOneParam  returnOneParam = (a -> {
            System.out.println("一个参数有返回");
            return  a;
        });

        System.out.println(returnOneParam.method(6));

        //多个参数有返回
        ReturnMultiParam returnMultiParam = (a,b) -> {
            return a+b;
        };

        System.out.println(returnMultiParam.method(3,4));


        ReturnOneParam lambda1 = grammar::doubleNum;
        System.out.println(lambda1.method(9));

        ReturnOneParam lambda2 = grammar::addTwo;
        System.out.println(lambda2.method(8));

    }


    public static int doubleNum(int a) {
        return a * 2;
    }

    public static int addTwo(int a) {
        return a + 2;
    }


}
