package 多线程.练习.a2;

public class a2 {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        Thread t3=new Thread(mr);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
