package 网络编程;

import javax.lang.model.element.Name;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class a5 {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms=new MulticastSocket(10000);
//        将当前本机添加到224.0.0.1这一组当中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        byte[] bytes=new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        ms.receive(dp);

        byte[] data = dp.getData();
        int length = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();
        System.out.println("ip为"+ip+",主机名为"+ name +"的人，发送了数据"+new String(data,0,length));

        ms.close();
    }
}
