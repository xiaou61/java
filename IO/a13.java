package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;

public class a13 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("src/IO/a.userinfo.txt");
        StringBuilder sb=new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }

        //排序


        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);


        //写出
        FileWriter fw=new FileWriter("src//IO//b.userinfo.txt");
        String s = Arrays.toString(arr).replace(", ","-");
        String result = s.substring(1, s.length() - 1);


        fw.write(result);

        fw.close();
    }

}
