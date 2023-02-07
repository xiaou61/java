package 多线程.练习;

public class a1 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
