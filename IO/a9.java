package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public class a9 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("src\\IO\\a.userinfo.txt");
        //底层还是一次读取一个字节，如果遇到中文的话，就会一次读取多个字节，GBK一次读两个字节，UTF-8一次读三个字节
        //read细节：在读取之后，方法的底层会就行解码，之后转成十进制。
        //最终把这个十进制，作为返回值
        //如果想看到中文汉字，要把这些十进制数据，就行强转成char
        char[] chars=new char[2];
        int len;
        //read(chars)底层原理：读取数据，解码，强转进行合并了，把强转之后的数组放入数组当中了。
        while ((len = fr.read(chars)) != -1) {
            //把数组中的数据变成字符串进行打印
            System.out.print(new String(chars,0,len));
        }
        fr.close();

    }
}
