package 集合进阶.a8泛型;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class a1没有泛型的情况 {
    //此时推出了泛型，她可以在创建对象的时候就出现了泛型
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //可以添加任意的数据
        list.add(123);
        list.add("aaa");

        //遍历集合，
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            //多态的弊端是不能访问子类的特有功能。
            //比如obj.length是不行的
            //如果进行强转的话
            //那么会报错，因为整型无法转成字符串
            System.out.println(obj);
        }
    }
}
