package 多线程.综合练习.a3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    //奖池 用集合方式
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<Integer>();
        while (true) {
            synchronized (MyCallable.class) {
                if (list.size() == 0) {
                    //这里表示抽奖结束
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int price = list.remove(0);
                    boxList.add(price);
                    //System.out.println(getName() + "又产生了一个" + price + "元的大奖");
                }
            }
            Thread.sleep(10);
        }
        if (boxList.size() == 0) {
            return null;
        }else {
            //返回集合中的最大值
            return Collections.max(boxList);
        }

    }
}
