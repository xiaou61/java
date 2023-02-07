package 集合进阶.a15Map;

import java.util.HashMap;
import java.util.Map;

public class a1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        //添加元素：如果键不存在，直接添加，如果键是存在的，他会覆盖。并且会返回覆盖值。
        //如果没有覆盖的话，返回的是null
        m.put("1","3");
        m.put("2","4");
        m.put("3","5");

        String put = m.put("3", "2");
        System.out.println(put);//这里打印的就是被覆盖的
        //这里把上面的数据覆盖了
        //打印集合
        System.out.println(m);
        //删除
        m.remove("1");
        m.remove("23");

        //清空
        m.clear();

        m.put("1","2");
        //判断是否包含
        boolean b = m.containsKey("1");
        boolean b1 = m.containsValue("2");

        //是否为空
        boolean empty = m.isEmpty();
    }
}
