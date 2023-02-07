package IO.a22转换序列化流流;

import java.io.*;
import java.nio.charset.Charset;

public class a1 {
    public static void main(String[] args) throws IOException {
        /*
        利用转换流按照指定字符编码读取(了解)
         */
        FileReader fr=new FileReader("src/IO/a22转换流/gbkfile.userinfo.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();



    }
}
