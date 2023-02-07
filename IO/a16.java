package IO;

import java.io.*;

public class a16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src//IO//a.userinfo.txt"));
        //细节：readline一次会读一整行。但他不会把回车换行读到内存当中
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
       }
        br.close();
    }
}
