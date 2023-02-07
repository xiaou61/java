package IO;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class a20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\IO\\csb.userinfo.txt"));
        String line;
        TreeMap<Integer,String> tm=new TreeMap<Integer, String>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),arr[1]);
        }
        //写出数据
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\IO\\copycsb.userinfo.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();
    }
}
