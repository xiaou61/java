package 常用API;

import java.util.Scanner;

public class a26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
//        String i = sc.next();
//        System.out.println(i);
        //弊端：在我们使用next nextInt nextDouble 在接受数据的时候，遇到空格，回车。
        //或者是制表符的时候就停止了
        //例如键盘输入123 123 就只能接受到前面的
        //规定：
        //以后我们要想键盘录入，不管什么类型，统一使用nextLine
        String s = sc.nextLine();
        System.out.println(s);


        //数据转换
        int i = Integer.parseInt(s);
        System.out.println(i+1);
    }
}
