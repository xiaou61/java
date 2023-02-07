package IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class a8 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String str="你好";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        //制定编码方式
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //解码默认为UTF-8
        String str2=new String(bytes1);
        System.out.println(str2);

        //如果用的GBK编码。用UTF-8来进行解的话，就会出现乱码。

        String str3 = new String(bytes2);
        System.out.println(str3);
    }
}
