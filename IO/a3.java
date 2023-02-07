package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class a3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/IO/a.userinfo.txt");
        //用一次读取一次
        int b1 = fis.read();
        int b2 = fis.read();
        System.out.println(b1);
        System.out.println(b2);
        //如果进行强转，就可以直接打印出原始内容
        System.out.println((char) b1);
        System.out.println((char) b2);
        fis.close();


        //如果read读取不到了，就会返回-1

    }


}
