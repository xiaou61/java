package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/IO/picture.jpg");
        //创建数组
        byte[] bytes=new byte[1024*1024];
        //返回值是本次读取到了多少个字节的数据
        int len = fis.read(bytes);
        System.out.println(len);

        String str=new String(bytes,0,len);
        System.out.println(str);
        /*
        这个会有个bug。比如说我们数组的长度太长的话，后面会打印出不需要的null。
        同时也可以能出现数组元素无法覆盖全面的问题。所以我们再newString对象的时候，可以使用
        String str=new String(bytes,0,len);来解决这个问题
         */

        fis.close();
    }
}
