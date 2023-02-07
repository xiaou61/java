package 多线程;
/*
细节：1.如果我们没有设置默认的名字，线程也是有默认的名字的。
格式Thread-X(X是序号，从0开始的)
2.如果要设置名字，可以用set设置，也可以用构造方法来进行设置
3.当JVM启动之后，他就会自动的去启动多条线程，其中有一条线程是main，他的作用就是
调用main方法。

 */
public class a4 {

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();

        t1.start();
        t2.start();
    }
}
