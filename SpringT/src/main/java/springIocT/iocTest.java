package springIocT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: nc
 * @description：
 */

public class iocTest {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("Music.xml");
        Music jay = ctx.getBean("jay",Music.class);


        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("Students.xml");
        Person studen2 = ctx1.getBean("st2" , Studen.class);
        System.out.println(studen2);

        /**
         * 延迟初始化bean
         * ApplicationContext实现的默认行为是在启动时将所有的singleton bean 提前进行实例化。这样配置中或者运行环境的错误就会立刻发现。
         * 如果你想延迟初始化。可以在xml中进行配置 lazy-init="true"
         *
         * 回调方法
         * 利用 在bean中添加 init-method = "方法名"  和destroy-method =" 方法名" 来让 Person对象回调用Student类的方法
           */
        Thread.sleep(3000);
        Person studen1 = ctx1.getBean("st1" , Studen.class);
        System.out.println(studen1);

        /**
         * spring 中默认的是单例的，通过scope 属性可以设置bean的的作用域
         */
        ApplicationContext ctx2 = new ClassPathXmlApplicationContext("Animal.xml");
        Animal animal1 = ctx2.getBean("dog" , Animal.class);
        Animal animal3 = ctx2.getBean("dog" , Animal.class);
        Animal animal2 = ctx2.getBean("cat" , Animal.class);
        System.out.println(animal1 == animal3);
        System.out.println(animal1);
        System.out.println(animal2);


        ApplicationContext ctx3 = new ClassPathXmlApplicationContext("car.xml");
        Car car = ctx3.getBean("bike" , Car.class);
        System.out.println(car);



    }

}
