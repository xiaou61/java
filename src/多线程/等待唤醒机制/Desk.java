package 多线程.等待唤醒机制;
/*
作用：控制生产者和消费者的执行
 */
public class Desk {
    //表示桌子上是否有面条，0为没有，1是有
    public static int foodFlag=0;
    //总个数
    public static int count=10;

    //锁对象
    public static Object lock=new Object();

}
