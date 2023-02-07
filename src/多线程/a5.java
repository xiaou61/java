package 多线程;

public class a5 {
    public static void main(String[] args) {
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"坦克");
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
