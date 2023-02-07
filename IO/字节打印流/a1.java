package IO.字节打印流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class a1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps=new PrintStream(new FileOutputStream("src/IO/字节打印流/a.userinfo.txt"),true,"UTF-8");
        ps.println(97);//写出+自动 刷新+自动换行
        ps.print(true);
        ps.printf("%s你好","李子凡");
        ps.close();
    }
}
