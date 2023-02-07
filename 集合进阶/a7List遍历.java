package 集合进阶;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class a7List遍历 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("--------------------------------------");

        //增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------");
        //lambda
        list.forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------");
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("--------------------------------------");

        ///列表迭代器
        //在迭代器的基础上，添加了在遍历的过程中，可以添加元素
        ListIterator<String> lt = list.listIterator();
        while (lt.hasNext()) {

            String next = lt.next();
            if ("bbb".equals(next)){
                lt.add("你好");
            }
            System.out.println(next);

        }
        System.out.println(list);


    }
}
