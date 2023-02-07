package IO;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class a5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/IO/picture.jpg");
        FileOutputStream fos=new FileOutputStream("src/IO/copyPicture.jpg");
        //拷贝
        //边读遍写
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        //规则，先开的流最后关闭
        fos.close();
        fis.close();
    }
}
