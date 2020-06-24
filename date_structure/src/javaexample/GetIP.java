package javaexample;

import java.net.InetAddress;

/**
 * @author: nc
 * @description：获取指定主机的ip
 */

public class GetIP {
    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address=InetAddress.getByName("www.baidu.com");
        }catch (Exception e){
            e.getMessage();
        }
        System.out.println(address.getHostName() +"="+ address.getHostAddress());
        System.exit(0);
    }
}
