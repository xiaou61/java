package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
这里加解密主要用到了异或算法
 */
public class a11 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis=new FileInputStream("src/IO/ency.jpg");
        FileOutputStream fos=new FileOutputStream("src/IO/redu.jpg");

        //解密处理
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b^2);
        }
        fos.close();
        fis.close();
    }
}
