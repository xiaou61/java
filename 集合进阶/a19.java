package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class a19 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        //批量添加
        Collections.addAll(list,"abc","deq","aadsbc","abcda","abagfc","abcfas","abdasfc","fqabc","abwwc");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
