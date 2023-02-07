package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class a19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\IO\\csb.userinfo.txt"));
        String line;
        ArrayList<String> list=new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        //排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //获取o1和o2的序号
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });
        System.out.println(list);

        //写出结果
        BufferedWriter bw = new BufferedWriter(new FileWriter("src//IO//copycsb.userinfo.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
