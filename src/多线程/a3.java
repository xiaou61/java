package 多线程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class a3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        第三种方法：
        特点：可以获取多线程的运行结果
        1.创建一个类myCallable
        2.重写里面的call是有返回值的。返回值表示多线程的运行结果
        3.在测试类中，创建mycallable的对象
        4.创建futureTask对象，用来管理多线程运行的结果
        5.创建Thread的对象。并启动
         */
        MyCallable mc=new MyCallable();

        FutureTask<Integer> ft=new FutureTask<>(mc);

        Thread t1 = new Thread(ft);

        t1.start();

        //获取结果
        Integer result = ft.get();
        System.out.println(result);

    }
}
