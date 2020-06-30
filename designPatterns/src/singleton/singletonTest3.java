package singleton;

/**
 * @author: nc
 * @description： 单例模式--静态内部类模式（所有单例模式中最推荐的）
 *
 *
 * 只有第一次调用getInstance方法时，虚拟机才加载 Inner 并初始化instance ，
 * 只有一个线程可以获得对象的初始化锁，其他线程无法进行初始化，保证对象的唯一性。
 * 目前此方式是所有单例模式中最推荐的模式，但具体还是根据项目选择。
 *
 */

public class singletonTest3 {
    private singletonTest3() {}

    //静态内部类
    private static class Inner {
        private static final singletonTest3 instance = new singletonTest3();
    }

    public static singletonTest3 getInstance() {
        return Inner.instance;
    }
}
