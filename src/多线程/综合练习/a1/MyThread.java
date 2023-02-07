package 多线程.综合练习.a1;

import java.util.Random;

public class MyThread extends Thread {
    //定义共享数据
    static double money = 100;
    static int count = 3;
    //最小的中奖金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包");
            } else {
                //表示中奖的金额
                double price = 0;
                if (count == 1) {
                    price = money;
                    //表示此时是最后一个红包，就无需随机，剩下所有的钱，都是中奖金额
                } else {
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    price = r.nextDouble(bounds);
                    if (price < MIN) {
                        price = MIN;
                    }
                }
                money = money - price;
                count--;
                System.out.println(getName() + "抢到了" + price + "元");
            }
        }
    }
}
