package 多线程.练习;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static int ticket=0;
    //一定要注意锁对象是唯一的，所以要在前面添加一个static关键字
    //创建一个锁的对象
    static Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            synchronized(MyThread.class){
                lock.lock();
            try {
                if (ticket < 100) {
                        Thread.sleep(10);
                    ticket++;
                    System.out.println(getName()+"正在卖"+ticket+"张票");
                }else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //这样就保证了锁一定会被释放
                lock.unlock();
            }

            }
        }
    }

