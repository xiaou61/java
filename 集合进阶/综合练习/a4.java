package 集合进阶.综合练习;

import java.util.*;

public class a4 {
    public static void main(String[] args) {
        //创建一个map集合
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        //创建单列集合
        ArrayList<String> city1 = new ArrayList<String>();

        Collections.addAll(city1, "南京市", "扬州市", "苏州市");

        ArrayList<String> city2 = new ArrayList<String>();

        Collections.addAll(city2, "武汉市", "宜昌市", "鄂州市");

        ArrayList<String> city3 = new ArrayList<String>();

        Collections.addAll(city3, "石家庄市", "保定市", "张家口市");

        hm.put("江苏省", city1);
        hm.put("湖南省", city2);
        hm.put("河北省", city3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(", ", "", "");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}
