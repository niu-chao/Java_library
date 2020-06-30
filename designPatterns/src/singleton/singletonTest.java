package singleton;

/**
 * @author: nc
 * @description： 单例模式--饿汉模式
 *
 * 线程安全，比较常用，但容易产生垃圾，因为一开始就初始化
 *
 *
 * 所谓单例，就是整个程序有且仅有一个实例。该类负责创建自己的对象，同时确保只有一个对象被创建。
 * 在Java，一般常用在工具类的实现或创建对象需要消耗资源。
 *
 * 特点:
 *
 * 类构造器私有
 * 持有自己类型的属性
 * 对外提供获取实例的静态方法
 *
 */

public class singletonTest {
    //此处定义类变量实例并直接实例化，在类加载的时候就完成了实例化并保存在类中
    private static singletonTest instance = new singletonTest();

    //定义无参构造器，用于单例实例
    private singletonTest() {}

    //定义公开方法，返回已创建的单例
    public static singletonTest getInstance() {
        return instance;
    }

    public String test() {
        return "这是一个测试的方法";
    }

    public static void main(String[] args) {

        singletonTest s1 = singletonTest.getInstance();
        singletonTest s2 = singletonTest.getInstance();
        System.out.println("正常情况下两个实例是否相同：" + (s1 == s2));

        singletonTest1 st1 = singletonTest1.getInstance();
        System.out.println(st1.test());

        singletonTest2 st2 = singletonTest2.getInstance();
        System.out.println(st2.test());

        singletonTest4 st4 = singletonTest4.INSTANCE;
    }

}
