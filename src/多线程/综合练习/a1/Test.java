package 多线程.综合练习.a1;

public class Test {
    //创建线程对象
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        MyThread t4=new MyThread();
        MyThread t5=new MyThread();

        t1.setName("用户1");
        t2.setName("用户2");
        t3.setName("用户3");
        t4.setName("用户4");
        t5.setName("用户5");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
