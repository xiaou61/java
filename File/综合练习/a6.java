package File.综合练习;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a6 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Lenovo\\Desktop");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);
    }
    /*
    作用：统计一个文件夹中，每种文件类型的个数
    参数：要统计的文件夹
    返回值：用来统计的map集合
    键：后缀名
    值：次数
     */
    public static HashMap<String,Integer> getCount(File src){
        //定义集合
        HashMap<String,Integer> hm=new HashMap<String, Integer>();

        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                String name = file.getName();
                String[] arr = name.split("\\.");
                if (arr.length>=2){
                    String endName=arr[arr.length - 1];
                    if (hm.containsKey(endName)){
                        //在集合中存在
                        Integer count = hm.get(endName);
                        count++;
                        hm.put(endName,count);
                    }else {
                        //在集合中不存在
                        hm.put(endName,1);
                    }
                }
            }else {
                //sonMap里面是子文件中每一种文件的个数
                HashMap<String, Integer> sonMap = getCount(file);
                //遍历sonMap
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if (hm.containsKey(key)){
                        //存在
                        Integer count = hm.get(key);
                        count+=value;
                        hm.put(key,count);
                    }else {
                        //不存在
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
