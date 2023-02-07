package 网络编程;

import java.io.IOException;
import java.net.*;

public class a2 {
    public static void main(String[] args) throws IOException {
        //发送数据
        //细节:绑定对应的端口
        //空参：所有可用的端口里随机一个端口
        DatagramSocket ds=new DatagramSocket();
        //打包数据
        String str="你好";
        byte[] bytes = str.getBytes();
        InetAddress adress = InetAddress.getByName("127.0.0.1");
        int port=10086;


        DatagramPacket dp= new DatagramPacket(bytes,bytes.length,adress,port);

        //发送数据
        ds.send(dp);

        ds.close();
    }
}
