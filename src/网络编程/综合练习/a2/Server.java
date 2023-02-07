package 网络编程.综合练习.a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);

        Socket socket = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int b;
        //read方法会从连接通道中，读取数据，但是要有一个结束标记。此时循环才会停止
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }
        //回写数据
        String str="你好呀";
        OutputStream os=socket.getOutputStream();
        os.write(str.getBytes());


        socket.close();
        ss.close();
    }
}
