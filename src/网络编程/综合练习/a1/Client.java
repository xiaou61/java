package 网络编程.综合练习.a1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket socket=new Socket("127.0.0.1",10000);
        OutputStream os = socket.getOutputStream();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要发送的信息");
            String str = sc.nextLine();
            if ("886".equals(str)){
                break;
            }
            os.write(str.getBytes());

        }
        socket.close();
    }
}
