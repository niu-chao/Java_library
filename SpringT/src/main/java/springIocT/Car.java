package springIocT;

/**
 * @author: nc
 * @description：车
 */

public class Car {
    private String name;

    private  Tyre tyre;

    public Car(String name, Tyre tyre) {
        this.name = name;
        this.tyre = tyre;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", tyre=" + tyre +
                '}';
    }
}
