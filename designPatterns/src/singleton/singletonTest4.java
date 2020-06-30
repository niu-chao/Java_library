package singleton;

/**
 * @author: nc
 * @description：单例模式--枚举单例模式
 */

public enum singletonTest4 {
    INSTANCE;
    public static singletonTest4 getInstance() {
        return INSTANCE;
    }


    public static void main(String[] args) {
        singletonTest4 st4 = singletonTest4.INSTANCE;
        singletonTest4 st = singletonTest4.INSTANCE;

        System.out.println(st == st4);
    }

}
