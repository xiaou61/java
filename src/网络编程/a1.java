package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class a1 {
    public static void main(String[] args) throws UnknownHostException {
        //电脑的对象
        InetAddress address = InetAddress.getByName("LAPTOP-5M8H38DP");
        System.out.println(address);
        System.out.println(address.getHostName());//名字
        System.out.println(address.getHostAddress());//ip
    }
}
