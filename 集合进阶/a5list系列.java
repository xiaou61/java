package 集合进阶;

import java.util.ArrayList;
import java.util.List;

public class a5list系列 {
    public static void main(String[] args) {
        //创建一个集合
        List <String> list=new ArrayList<>();
        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        //打印集合
        System.out.println(list);

        list.add(1,"qqq");
        System.out.println(list);

        String remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);


        String result = list.set(0, "aaa");
        System.out.println(result);
        System.out.println(list);

        String s = list.get(1);
        System.out.println(s);

    }
}
