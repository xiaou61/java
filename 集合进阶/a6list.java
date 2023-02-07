package 集合进阶;

import java.util.ArrayList;
import java.util.List;

public class a6list {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);//此时删除的是1这个元素，还是1索引上的元素？
        //删除的是1索引上的元素
        System.out.println(list);
        //因为当方法出现重载的时候，会优先调用与她类型相同的那个方法
    }
}
