package IO2.综合练习;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class a5 {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();

        prop.put("aaa","bbb");
        prop.put("ccc","bbb");
        prop.put("ddd","bbb");


        FileOutputStream fos=new FileOutputStream("src/IO2/综合练习/a.txt");
        prop.store(fos,"test");
        fos.close();

    }
}
