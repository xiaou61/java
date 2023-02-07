package 多线程.等待唤醒机制;

public class demo {
    public static void main(String[] args) {
        //创建线程对象
        Cook c=new Cook();
        Foodie f=new Foodie();

        //给线程设置名字
        c.setName("厨师");
        f.setName("吃货");

        c.start();
        f.start();
    }
}
