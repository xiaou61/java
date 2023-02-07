package stream流;

import java.util.HashMap;

public class a3 {
    public static void main(String[] args) {
        //创建双列集合
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);
        hm.put("eee",555);
        //第一种：获取stream流，这里的s表示的就是每个键
        hm.keySet().stream().forEach(s -> System.out.println(s));
        //第二种方法，这里的s表示的是每个键值对 对象
        hm.entrySet().stream().forEach(s-> System.out.println(s));
    }
}
