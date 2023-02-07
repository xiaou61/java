package 网络编程;

import javax.xml.transform.Source;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class a3 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);//创建对象，在接受的时候要绑定端口

        byte[] bytes=new byte[1024];


        DatagramPacket dp= new DatagramPacket(bytes,bytes.length);
        //接受数据包
        ds.receive(dp);
        //解析
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("接收到的数据"+new String(data,0,len));
        System.out.println("该数据是从"+address+"中的"+port+"端口发出的");
        ds.close();
    }
}
