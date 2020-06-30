package singleton;

/**
 * @author: nc
 * @description： 单例模式--双重锁模式
 *
 *
 * 双重检查模式，进行了两次的判断，第一次是为了避免不要的实例，第二次是为了进行同步，避免多线程问题。
 * 由于singleton=new Singleton()对象的创建在JVM中可能会进行重排序，在多线程访问下存在风险，
 * 使用volatile修饰signleton实例变量有效，解决该问题。
 *
 */

public class singletonTest2 {
    private volatile static singletonTest2 instance;

    private singletonTest2() {}

    public static singletonTest2 getInstance() {

        if (instance == null) {
            synchronized(singletonTest2.class) {
                if (instance == null) {
                    instance = new singletonTest2();
                }
            }
        }
        return instance;
    }
    public String test() {
        return "这是一个测试的方法";
    }


    public static void main(String[] args) {
        singletonTest st = singletonTest.getInstance();
        System.out.println(st.test());

        singletonTest1 st1 = singletonTest1.getInstance();
        System.out.println(st1.test());
    }

}
