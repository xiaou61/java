package 常见算法.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambda练习 {
    public static void main(String[] args) {
        String[]arr={"a","aaaa","aaa","aa"};
        //如果我们要把数组中的数据排列，就要用到sort方法
        Arrays.sort(arr,(o1,o2)->o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
