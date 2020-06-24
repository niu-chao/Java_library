package Judge_null;



/**
 * @author: nc
 * @description： String 字符串的空值判断
 *
 * null表示这bai个字符串不指du向任何的东西，如果这时候你调用他的方法，那么就会出现空指针异常
 * 而""表示他指向一个长度为0的字符串，这时候调用他的方法是安全的。
 *
 */

public class String_judge {

    public static void main(String[] args) {
        String str = "";

        //先判断字符串是否为null,然后判断是否为("")长度为0的字符串，判断的顺序不能乱
        if (str != null && str.length()!=0 ) {
            System.out.println("str不为空");
        } else {
            System.out.println("str为空");
        }

    }

}
