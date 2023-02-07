package 网络编程;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class a6 {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket socket=new Socket("127.0.0.1",10000);

        //可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出
        os.write("你好你好".getBytes());

        os.close();
        socket.close();
    }
}
