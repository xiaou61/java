package 集合进阶;

import java.util.SplittableRandom;

public class a18 {
    //jkd5以后提出了可变参数这个特性。
    //方法形参的个数是可以变化的，
    //数据类型...名字
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7));
    }
    //可变参数的底层就是系统自动创建的数组
    public static int getSum(int...args){
        int sum=0;
        for (int arg : args) {
            sum=sum + arg;
        }
        return sum;
    }
}
