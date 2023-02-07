package 多线程.等待唤醒机制.a2;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo{
    public static void main(String[] args) {
        //创建 阻塞队列对象
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<String>(1);
        Cook c=new Cook(queue);
        Foodie f=new Foodie(queue);
        c.start();
        f.start();
    }
}
