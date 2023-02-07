package 多线程.练习.a2;

public class MyRunnable implements Runnable{
    int ticket=0;//这里不用加static， 因为myrunnable只会创建一次他的对象

    @Override
    public void run() {
        while (true) {
                if (methon()) {
                    break;
                }
        }
    }

    private synchronized boolean methon() {
        if (ticket == 100) {
            return true;
        }else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第"+ticket+"张票");
        }
        return false;
    }
}
