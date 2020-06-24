package springIocT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: nc
 * @description：
 */

public class Music {
    public Music () {
        System.out.println("播放老鼠爱大米");

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,23,4,5,6,7);

        list.forEach(System.out ::println);

    }
}
