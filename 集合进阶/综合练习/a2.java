package 集合进阶.综合练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class a2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();

        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);

        Collections.shuffle(list);

        Random r=new Random();
        int index = r.nextInt(list.size());
        Integer number = list.get(index);

        //创建俩个集合
        ArrayList<String> boylist=new ArrayList<String>();
        ArrayList<String> girllist=new ArrayList<String>();

        Collections.addAll(boylist,"小一","小二","小三");
        Collections.addAll(girllist, "小四","小五","小六");

        //判断是从那个集合里面抽取
        if (number==1){
            //从boylist里面抽取
            int boyindex = r.nextInt(boylist.size());
            System.out.println(boylist.get(boyindex));
        }else {
            int girlindex = r.nextInt(girllist.size());
            System.out.println(girllist.get(girlindex));
        }
    }
}
