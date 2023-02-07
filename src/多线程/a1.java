package 多线程;

public class a1 {
    public static void main(String[] args) {
        /*
        多线程的第一种启动方式
        1.自己继承一个类，继承Thread
        2.重写run方法
        3.创建子类的对象，并启动现成
         */
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        //启动线程
        //这里的start表示开启线程
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();

    }
}
