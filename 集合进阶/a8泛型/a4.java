package 集合进阶.a8泛型;

import java.util.ArrayList;

public class a4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();

        ListUtil.addAll(list,"aaa","bbb","ccc","ddd","eee");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ListUtil.addAll(list2,1,2,3,4,5);
    }
}
