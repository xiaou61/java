package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class a1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("src/IO/a.userinfo.txt");
        //写出数据,用的是ASCII码
        fos.write(97);
        //释放资源
        fos.close();
    }
}
