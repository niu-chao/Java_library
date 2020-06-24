package springIocT;

/**
 * @author: nc
 * @description：
 */

public class Animal {
    /**
     * 动物名
     */
    private  String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
