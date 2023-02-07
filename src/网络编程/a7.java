package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class a7 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        //监听链接
        Socket socket = ss.accept();


        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }
        socket.close();
        ss.close();
    }
}
