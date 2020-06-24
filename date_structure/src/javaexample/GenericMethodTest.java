package javaexample;

/**
 * @author: nc
 * @description：泛型
 */

public class GenericMethodTest {

    public  static <E> void  printArray(E[] inputArry){
        for (E ele:inputArry) {
            System.out.printf("%s ",ele);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5,6};
        Double [] doubleArry = {1.1,2.2,3.3,4.4,5.5,6.6};
        Character [] charArry = {'s','f','t','h','k'};

        System.out.println("整形数组：");
        printArray(intArray);

        System.out.println("双精度型数组");
        printArray(doubleArry);

        System.out.println("字符型数组");
        printArray(charArry);
    }
}
