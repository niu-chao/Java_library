package singleton;

/**
 * @author: nc
 * @description：
 *
 * 普通类的各个实例对象是不同的，单例模式的各个实例对象在正常情况下是相同的。
 */

public class puTongTest {

    public static void main(String[] args) {
        puTongTest pt = new puTongTest();
        puTongTest pt1 = new puTongTest();

        System.out.println("普通类两个实例对象是否相同：" + (pt == pt1));
    }
}
