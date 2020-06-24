package javaexample;

import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author: nc
 * @description：查看端口是否已使用
 */

public class SelectPort {
    public static void main(String[] args) {
        Socket skt;
        String  host = "localhost";
        if(args.length >0){
            host= args[0];
        }

        for (int i= 0 ; i<1024; i++){
            try {
                System.out.println("查看"+ i);
                skt = new Socket(host ,i);  //利用异常跳过下一步
                System.out.println("端口"+i+"已被使用");
            }catch (UnknownHostException e){
                System.out.println("Exception "+e);
            }catch (Exception e){
                System.out.println(i);
            }
        }
    }
}
