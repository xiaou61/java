package 集合进阶.a8泛型;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {}

    /*
    参数：1、集合
    2~最后：要添加的元素
     */
    public static<E> void addAll(ArrayList<E> list,E e1,E e2,E e3,E e4,E e5){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
    }
}
