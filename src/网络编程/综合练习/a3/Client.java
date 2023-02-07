package 网络编程.综合练习.a3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/网络编程/综合练习/a3/Client/Client.mp4"));


        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes=new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        //往服务器写出结束标记
        socket.shutdownOutput();
        //接受服务器的会写数据
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);

        //释放资源
        socket.close();
    }
}
