package 多线程.综合练习.a2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    //奖池 用集合方式
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class){
                if (list.size()==0){
                    break;
                }else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int price = list.remove(0);
                    System.out.println(getName()+"又产生了一个"+price+"元的大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
