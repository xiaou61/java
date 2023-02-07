package 集合进阶;

import java.util.TreeSet;

public class a12TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);

        //直接打印结合
        System.out.println(ts);//已经排好序了，默认排序规则从小到大
        //遍历
        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}
