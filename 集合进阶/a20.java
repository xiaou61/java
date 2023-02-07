package 集合进阶;

import java.util.List;
import java.util.concurrent.CancellationException;

public class a20 {
    public static void main(String[] args) {
        //一旦创建完毕就无法修改
        List<String> list = List.of("张三", "李四");
        System.out.println(list.get(0));

        for (String s : list) {
            System.out.println(s);
        }

        try {
            list.add("aaa");//这里就会报错的
        } catch (Exception e) {
            throw new RuntimeException("错误");
        }

    }
}
