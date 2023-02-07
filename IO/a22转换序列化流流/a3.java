package IO.a22转换序列化流流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class a3 {
    public static void main(String[] args) throws IOException {
        //将gbk转变成utf-8
        FileReader fr=new FileReader("src/IO/a22转换流/gbkfile.userinfo.txt", Charset.forName("GBK"));

        FileWriter fw=new FileWriter("src/IO/a22转换流/copygbkfile.userinfo.txt",Charset.forName("UTF-8"));

        int b;
        while ((b = fr.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
