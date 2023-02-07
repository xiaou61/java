package 集合进阶;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a9Set {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        boolean r1=s.add("张三");
        boolean r2 = s.add("张三");
        System.out.println(r1);//true
        System.out.println(r2);//false
        System.out.println(s);//[张三]
        //这里的false因为添加失败。

        //另外他是无序的
        s.add("1");
        s.add("2");
        s.add("3");
        System.out.println(s);//这里打印出来是无序的

        //并且没有s.get方法。

        //遍历方法1:
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println("------------------------");
        //遍历方法2:
        for (String s1 : s) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        //遍历方法3:
        s.forEach(s1 -> System.out.println(s1));
    }

}
