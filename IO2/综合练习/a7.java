package IO2.综合练习;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class a7 {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        //读取本地
        FileInputStream fis=new FileInputStream("E:\\untitled\\src\\IO2\\综合练习\\a.txt");

        prop.load(fis);

        fis.close();

        //打印集合
        System.out.println(prop);
    }

}
