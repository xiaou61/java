package stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class a2 {
    public static void main(String[] args) {
        //单列集合获取
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a","b","c","d");
        //获取到一条流水线，并把集合中的数据，放到流水线上
        Stream<String> stream1 = list.stream();
        //使用终结方法，打印一下流水线上的所有数据
        stream1.forEach(s -> System.out.println(s));
    }


}
