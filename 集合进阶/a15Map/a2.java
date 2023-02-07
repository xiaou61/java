package 集合进阶.a15Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class a2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("你", "好");
        map.put("晚", "安");
        map.put("再", "见");
        map.forEach((key,value) -> System.out.println(key + ": "+value));
    }
}
