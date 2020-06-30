package singleton;

/**
 * @author: nc
 * @description： 单例模式--懒汉模式
 *
 * 线程不安全，延迟初始化，严格意义上不是不是单例模式
 */

public class singletonTest1 {
    //定义一个私有类变量来存放单例，私有的目的是指外部无法直接获取这个变量，而要使用提供的公共方法来获取
    private static singletonTest1 instance;

    //定义私有构造器，表示只在类内部使用，亦指单例的实例只能在单例类内部创建
    private singletonTest1() {}

    //定义一个公共的公开的方法来返回该类的实例，由于是懒汉式，需要在第一次使用时生成实例，所以为了线程安全，使用synchronized关键字来确保只会生成单例
    public static synchronized singletonTest1 getInstance() {
        if (instance == null) {
            instance = new singletonTest1();
        }
        return instance;
    }

    public String test() {
        return "这是一个测试的方法";
    }

    public static void main(String[] args) {
        singletonTest st = singletonTest.getInstance();
        System.out.println(st.getClass());
        System.out.println(st.test());
        System.out.println(singletonTest1.class);

        singletonTest2 st2 = singletonTest2.getInstance();
        System.out.println(st2.test());
    }
}
