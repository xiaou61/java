package stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class a6 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, "张三-男-12", "李四-男-13", "张五-女-15");

        Map<String, Integer> map = list1.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        //键的生成规则
                        s -> s.split("-")[0]
                        ,
                        //值的生成规则
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(map);
    }
}
