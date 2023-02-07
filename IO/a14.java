package IO;

import java.io.*;

public class a14 {
    public static void main(String[] args) throws IOException {
        //创建缓冲流对象
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/IO/a.userinfo.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/IO/b.userinfo.txt"));


        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
