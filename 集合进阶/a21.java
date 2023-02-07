package 集合进阶;

import java.util.Map;

public class a21 {
    public static void main(String[] args) {
        Map<String,String> map=Map.of("1","2","3","4");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey()+stringStringEntry.getValue());
        }
    }
}
