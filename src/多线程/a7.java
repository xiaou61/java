package 多线程;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class a7 {
    public static void main(String[] args) {
        //获取线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //销毁线程池
        pool1.shutdown();
    }
}
