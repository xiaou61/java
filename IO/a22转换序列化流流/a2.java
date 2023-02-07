package IO.a22转换序列化流流;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class a2 {
    public static void main(String[] args) throws IOException {
          /*
    利用转换流按照指定字符编码写出
     */
        FileWriter fw = new FileWriter("src/IO/a22转换流/c.userinfo.txt", Charset.forName("GBK"));

        fw.write("你好");

        fw.close();
    }
}
