package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
如果想要续写，可以打开续写开关，就是在创建对象的时候的第二个参数。默认为false，此时创建对象就会清空文件。
 */
public class a2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("src/IO/a.userinfo.txt");
        String str="nihao";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        //换行windows:/r/n
        //细节：在windows系统中。java对换行进行了优化。可以写其中的/r或者是/n就可以实现换行
        //但是最好还是写全了。


        String wrap="\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);


        String str2="wanan";
        byte[] bytes1 = str2.getBytes();
        fos.write(bytes1);

        fos.close();
    }
}
