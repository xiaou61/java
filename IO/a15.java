package IO;

import java.io.*;

public class a15 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/IO/a.userinfo.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/IO/b.userinfo.txt"));

        byte[] bytes=new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
