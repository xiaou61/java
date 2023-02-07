package 集合进阶.综合练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class a3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, "小明", "中明", "大明");
        Random r=new Random();

        //创建一个临时的结合
        ArrayList<String> list2=new ArrayList<String>();
        //i表示第几轮
        for (int i = 0; i < 10; i++) {
            //获取集合的长度
            int count=list1.size();
            System.out.println("===================第"+i+"轮点名===================");
            //随机点名
            for (int j = 0; j < count; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }//此时表示一轮点名结束
            list1.addAll(list2);
            list2.clear();
        }




    }
}
