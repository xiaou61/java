package 集合进阶.a15Map;

import java.util.TreeMap;

public class a8 {
    public static void main(String[] args) {
        String s="aababbacacacabddee";
        //创建集合
        TreeMap<Character,Integer> tm=new TreeMap<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //拿着c到集合中判断是否存在
            //存在，表示当前字符又出现了一次
            //不存在，表示当前字符是第一次出现
            if (tm.containsKey(c)){
                //存在
                Integer count = tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                //不存在
                tm.put(c,1);
            }

        }
        //遍历集合，并按照指定的格式进行拼接
        StringBuilder sb=new StringBuilder( );
        tm.forEach((key,value)->{
            sb.append(key).append("(").append(value).append(")");
        });
        System.out.println(sb);
    }
}
