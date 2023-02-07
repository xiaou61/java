package 多线程.等待唤醒机制.a2;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    //利用堵塞队列完成代码
    //细节：生产者和消费者必须使用同一个阻塞队列
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //不断的放到阻塞队列当中
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
