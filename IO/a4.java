package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/IO/a.userinfo.txt");

        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();
    }

}
