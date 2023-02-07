package IO;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class a12 {
    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("src/IO/a.userinfo.txt");
        StringBuilder sb=new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        //排序
        String s = sb.toString();
        String[] arrStr = s.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrStr.length; i++) {
            list.add(i);
        }


        Collections.sort(list);

        FileWriter fw=new FileWriter("src/IO/b.userinfo.txt");

        for (int i = 0; i < list.size(); i++) {
            if (i==list.size() - 1){
                fw.write(list.get(i)+"");
            }else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();
    }
}
