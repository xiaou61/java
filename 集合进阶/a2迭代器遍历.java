package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a2迭代器遍历 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<String>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        //获取迭代器对象
        //迭代器就好像一个箭头，默认指向0索引处
        Iterator<String> it = coll.iterator();
        //利用循环进行遍历
        while (it.hasNext()) {
            //获取元素并移动指针
            String next = it.next();
            System.out.println(next);
        }
    }
}
