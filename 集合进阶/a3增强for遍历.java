package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;

public class a3增强for遍历 {
    public static void main(String[] args) {
        Collection <String> coll=new ArrayList<String>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        //快捷键是iter
        //s就是一个第三方遍历，在遍历中，会依次表示每一个数据
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
