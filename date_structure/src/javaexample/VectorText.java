package javaexample;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

/**
 * @author: nc
 * @description：向量
 */

public class VectorText {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(new Double("3.0115"));
        v.add(new Double("3.2553"));
        v.add(new Double("3.2646"));
        v.add(new Double("3.9513"));
        Object obj = Collections.max(v);
        System.out.println("最大元素是："+obj);
    }
}
