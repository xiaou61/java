package 集合进阶.综合练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class a1 {
    public static void main(String[] args) {
        //添加集合
        ArrayList<String> list=new ArrayList<String>();


        //添加数据
        Collections.addAll(list,"小明","中明","大明");

        //打乱
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
