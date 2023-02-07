package stream流.a7综合练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a3 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();

        Collections.addAll(manList, "你好呀,12", "晚安了,20", "你快睡,10", "在吗呢,55");

        Collections.addAll(womenList, "在吗,10", "睡吧,22", "杨羊,85", "杨是,12");

        Stream<String> stream1 = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        Stream<String> stream2 = womenList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);

        //合并流并且  演员信息封装成Actor对象
        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());



        System.out.println(list);


    }


}
