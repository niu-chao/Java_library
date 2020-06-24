package springIocT;

/**
 * @author: nc
 * @description：轮胎
 */

public class Tyre {
    private String name;

    public Tyre(String name) {
        this.name = name;
    }

    public Tyre() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                '}';
    }
}
