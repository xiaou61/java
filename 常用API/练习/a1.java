package 常用API.练习;

import java.util.ArrayList;
import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Integer> list=new ArrayList<Integer>();

        Scanner sc=new Scanner(System.in);



        while (true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            //先把异常数据进行过滤
            if (num < 1 && num > 100) {
                System.out.println("当前数字不符合规范");
                continue;
            }


            //添加到集合当中
            list.add(num);


            //求和的方法
            int sum=getSum(list);
            if (sum>200){
                System.out.println("集合满足要求");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            System.out.println(integer+", ");
        }
    }

    private static int getSum(ArrayList<Integer> list) {

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            sum=sum+num;
        }
        return sum;
    }
}
