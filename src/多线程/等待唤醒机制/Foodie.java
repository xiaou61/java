package 多线程.等待唤醒机制;

public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }else {
                    //先去判断桌子上是否有面条，没有就等待，如果有就开吃
                    //吃完之后，唤醒厨师继续做，还需要把吃的总数-1
                    //修改桌子的状态
                    if (Desk.foodFlag == 0) {
                        //如果没有就等待
                        try {
                            Desk.lock.wait();//这样可以让当前线程跟锁绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //先吃
                        Desk.count--;
                        System.out.println("正在吃面条还可以吃"+Desk.count+"碗");
                        Desk.lock.notifyAll();//唤醒绑定在这把锁上的所有线程
                        Desk.foodFlag = 0;
                    }
                }

            }
        }
    }
}
