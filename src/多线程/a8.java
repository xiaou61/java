package 多线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a8 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,//核心线程数量，不能小于0
                6,//最大线程数量,需要大于等于核心线程数量
                60,
                TimeUnit.SECONDS,//这里用的是六十秒，用的是TimeUnit指定
                new ArrayBlockingQueue<>(3),//阻塞队列
                Executors.defaultThreadFactory(),//创建线程工程
                new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略
        );
    }
}
