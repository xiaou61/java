package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class a17 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("c.userinfo.txt"));

        bw.write("你好呀");
        //这个类所独有的
        bw.newLine();
        bw.close();
    }
}
