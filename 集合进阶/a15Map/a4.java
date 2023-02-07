package 集合进阶.a15Map;

import com.sun.jdi.Value;

import java.util.*;

public class a4 {
    public static void main(String[] args) {
        //定义一个数组
        String[] arr = {"a", "b", "c", "d" };
        //利用随机数进行投票
        ArrayList<String> list=new ArrayList<String>();
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        //如果要统计的东西，比较多，是不方便使用计数器思想的。我们可以定义map
        HashMap<String,Integer> hm=new HashMap<String, Integer>();
        for (String name : list) {
            //判断当前的经典在map中是否存在
            if (hm.containsKey(name)){
                //存在
                //获取当前景点已经被投票的次数
                Integer count = hm.get(name);
                //表示当前景点又被投了一次
                count++;
                //把新的次数添加到集合中
                hm.put(name, count);
            }else {
                //不存在
                hm.put(name,1);
            }
        }
        System.out.println(hm);

        //求最大值
        int max=0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count=entry.getValue();
            if (count > max) {
                max = count;
            }
        }

        //判断那个景点的次数和最大值一样，如果一样打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            int count=entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }

    }
}
