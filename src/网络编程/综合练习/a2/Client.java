package 网络编程.综合练习.a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);

        String str="你好";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        socket.shutdownOutput();
        //接受服务器的数据
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1) {
            System.out.println((char) b);
        }

        socket.close();
    }
}
