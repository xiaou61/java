package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class a7 {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        FileInputStream fis=new FileInputStream("src/IO/picture.jpg");
        FileOutputStream fos=new FileOutputStream("src/IO/NewPicture.jpg");
        int len;
        byte[] bytes=new byte[5];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
