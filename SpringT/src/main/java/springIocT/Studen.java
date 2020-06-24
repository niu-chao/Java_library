package springIocT;

/**
 * @author: nc
 * @description：
 */

public class Studen extends  Person {

    //身高
    public int height;

    //有参构造函数
    public Studen(String name , int height) {
        this.name = name;
        this.height = height;
    }

    public Studen() {}

    public String toString() {
        return  "Student{" + "name:" + name + ",height:" + height + "}";
    }

    public void init() {
        System.out.println("执行init方法");
    }

    public void over() {
        System.out.println("执行over方法");
    }



}
