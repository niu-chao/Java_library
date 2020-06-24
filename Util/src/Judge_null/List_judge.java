package Judge_null;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: nc
 * @description： 集合判断是否为空
 */

public class List_judge {
    public static void main(String[] args) {
        List list = new ArrayList();

        if (list != null && !list.isEmpty() ) {
            System.out.println("集合不为空");
        } else {
            System.out.println("集合为空");
        }

    }

}
