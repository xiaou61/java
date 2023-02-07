package 多线程;

public class a2 {
    public static void main(String[] args) {
        /*
        1.自己定义一个类，用来实现runnable接口
        2.重写里面的run方法。
        3.创建自己的这个类的对象。
        4.创建一个thread类的对象，并且开启线程
         */
        MyRun mr=new MyRun();
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);


        //给线程设置名字
        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
