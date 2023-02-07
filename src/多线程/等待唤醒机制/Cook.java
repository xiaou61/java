package 多线程.等待唤醒机制;

public class Cook extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else {
                    //判断桌子上是否有食物
                    //如果有，就等待，如果没有就开始制作食物。
                    //需要修改桌子上的食物的状态
                    //叫醒等待的消费者
                    if (Desk.foodFlag==1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }else {
                        System.out.println("厨师做了一碗面条");
                        Desk.foodFlag=1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
