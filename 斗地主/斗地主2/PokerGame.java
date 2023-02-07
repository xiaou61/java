package 斗地主.斗地主2;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //牌盒Map
    //此时我们只需要把牌跟序号产生对应关系就可以了，不需要按照序号进行排序，所以用hashmap

    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //细节
        //牌的序号
        int serialNumber = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

        /*
        如果是color里面嵌套number的话，就会有这样的问题。很明显是不对的
      {1=♦3, 2=♦4, 3=♦5, 4=♦6, 5=♦7, 6=♦8, 7=♦9, 8=♦10, 9=♦J, 10=♦Q, 11=♦K, 12=♦A, 13=♦2,
      14=♣3, 15=♣4, 16=♣5, 17=♣6, 18=♣7, 19=♣8, 20=♣9, 21=♣10, 22=♣J, 23=♣Q, 24=♣K, 25=♣A, 26=♣2,
      27=♥3, 28=♥4, 29=♥5, 30=♥6, 31=♥7, 32=♥8, 33=♥9, 34=♥10, 35=♥J, 36=♥Q, 37=♥K, 38=♥A,
      39=♥2, 40=♠3, 41=♠4, 42=♠5, 43=♠6, 44=♠7, 45=♠8, 46=♠9, 47=♠10, 48=♠J, 49=♠Q, 50=♠K, 51=♠A, 52=♠2,
      53=小王, 54=大王}
         */
        /*
        如果我们是number里面嵌套color的话，可以发现这个顺序是非常的正确的。
        {1=♦3, 2=♣3, 3=♥3, 4=♠3, 5=♦4, 6=♣4, 7=♥4, 8=♠4, 9=♦5, 10=♣5, 11=♥5, 12=♠5, 13=♦6,
        14=♣6, 15=♥6,16=♠6, 17=♦7, 18=♣7, 19=♥7, 20=♠7, 21=♦8, 22=♣8, 23=♥8,
         24=♠8, 25=♦9, 26=♣9, 27=♥9,
          28=♠9, 29=♦10, 30=♣10, 31=♥10, 32=♠10, 33=♦J, 34=♣J, 35=♥J, 36=♠J, 37=♦Q, 38=♣Q,
           39=♥Q, 40=♠Q, 41=♦K, 42=♣K, 43=♥K, 44=♠K, 45=♦A, 46=♣A, 47=♥A, 48=♠A,
            49=♦2, 50=♣2, 51=♥2, 52=♠2, 53=小王, 54=大王}

         */
        System.out.println(hm);

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        //这里的treeset可以进行排序,把添加到的键，也就是序号直接进行排序了
        TreeSet<Integer> lord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            //i:依次表示集合中的每一个索引
            //list.get(i)获得是每个具体的牌
            int serialNumber= list.get(i);
            if (i<=2){
                lord.add(serialNumber);
                continue;
            }
            if (i%3==0){
                player1.add(serialNumber);
            }else if (i % 3 == 1) {
                player2.add(serialNumber);
            }else {
                player3.add(serialNumber);
            }
        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }
    /*
    参数1：玩家的名字
    参数2：牌的序号
     */
    public void lookPoker(String name,TreeSet<Integer> ts){
        System.out.println(name+": ");
        //遍历treeset集合，得到每一个集合，拿到序号，在map序号中得到牌
        for (Integer serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
