package 斗地主.斗地主1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //牌盒
    static ArrayList<String> list=new ArrayList<String>();
    //静态代码块：随着类的加载而加载，而且只执行一次
    static {
        //准备牌:
        String[] color={"♦","♣","♥","♠"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (String c : color) {
            for (String n : number) {
                list.add(c+n);
            }
        }
        list.add("小王");
        list.add("大王");
    }


    public PokerGame(){

        //洗牌
        Collections.shuffle(list);

        //发牌
        //lord是地主的意思，因为底牌是给地主准备的，所以说叫做lord
        ArrayList<String> lord=new ArrayList<String>();
        ArrayList<String> player1=new ArrayList<String>();
        ArrayList<String> player2=new ArrayList<String>();
        ArrayList<String> player3=new ArrayList<String>();

        //遍历牌盒，得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //发底牌
            if (i<=2){
                lord.add(poker);
                continue;
            }
            //给三个玩家轮流发牌
            //i % 3
            if (i%3==0){
                player1.add(poker);
            }else if (i % 3 == 1){
                player2.add(poker);
            }else {
                player3.add(poker);
            }

        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }
    //参数1表示玩家的名字，参数2表示每位玩家的牌
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+": ");

        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }

}
