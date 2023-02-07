package 集合进阶.a15Map;

import java.util.Comparator;
import java.util.TreeMap;

public class a6 {
    public static void main(String[] args) {
        TreeMap <Integer,String> tm=new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            //o1:要添加的
            //o2:已经在的元素
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        tm.put(1,"月月");
        tm.put(2,"考试");
        tm.put(3,"核桃");
        tm.put(4,"雷碧");
        tm.put(5,"可惜");
        System.out.println(tm);//默认按照键的升序排列
    }
}
