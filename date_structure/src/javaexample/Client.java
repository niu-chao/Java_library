package javaexample;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author: nc
 * @description：客户端
 */

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",8888);
            InputStream is = s.getInputStream();
            OutputStream os =s.getOutputStream();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write("你好啊，交个朋友吧");
            bw.flush();

            //读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println("服务器："+mess);

        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
