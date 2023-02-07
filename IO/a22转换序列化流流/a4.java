package IO.a22转换序列化流流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class a4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/IO/a22转换流/a.userinfo.txt");
        //这样可以解决乱码问题
        InputStreamReader isr=new InputStreamReader(fis);
        //这样可以解决一次读一行问题
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        System.out.println(str);

        br.close();
    }
}
