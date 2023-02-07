package 斗地主.斗地主3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    //创建一个集合，用来添加牌的价值
    static HashMap<String, Integer> hm = new HashMap<>();

    //牌盒
    static ArrayList<String> list = new ArrayList<String>();

    //静态代码块：随着类的加载而加载，而且只执行一次
    static {
        //准备牌:
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");

        //指定牌的价值
        //如果存在，获得价值，如果不存在，表示本身的数字就是其价值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);


    }


    public PokerGame() {

        //洗牌
        Collections.shuffle(list);

        //发牌
        //lord是地主的意思，因为底牌是给地主准备的，所以说叫做lord
        ArrayList<String> lord = new ArrayList<String>();
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();

        //遍历牌盒，得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //发底牌
            if (i <= 2) {
                lord.add(poker);
                continue;
            }
            //给三个玩家轮流发牌
            //i % 3
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }

        }

        //排序：
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);


    }

    //利用牌的价值进行排序
    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            //o1:表示当前要插入到有序数列中的牌
            //o2:已经在有序数列中的牌
            //负数：o1小 插到前面
            //整数 o2大 插入后面
            //0：需要按照花色进行排序
            @Override
            public int compare(String o1, String o2) {
                //计算o1的花色和价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                //计算o2的花色和价值
                String color2 = o2.substring(1, 1);
                int value2 = getValue(o2);
                //比较o1和o2的价值
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;

            }
        });

    }

    //利用这个方法计算牌的价值，
    //参数：牌
    //返回值：价值
    public int getValue(String poker) {
        String number = poker.substring(1);

        //拿着数字到map里面判断
        if (hm.containsKey(number)) {
            //获取价值
            return hm.get(number);
        } else {
            //不存在类型转换
            /*
            这里会有一点小bug。就是小王和大王的时候，无法进行类型的强转。
            这里的解决方案也是非常地简单：
            看String number = poker.substring(1);这个地方，他是从1索引开始截取的。
            如果说，我们在小王的前面加上空格，那么他就可以截取到小王这个索引了
            所以解决方案，就很明显了，在add小王的时候，加一个空格就可以了。
            这样就可以保证，大小王和前面牌的格式一样了。
             */
            return Integer.parseInt(number);
        }
    }
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+": ");

        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }

}
