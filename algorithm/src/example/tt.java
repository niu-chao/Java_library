package example;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: nc
 * @description： 获取当前时间
 */

public class tt {
    public static void main(String[] args) {
        String a= new SimpleDateFormat("hhmmss").format(new Date());
        System.out.println(a.length());
        System.out.println(a);
    }
}
