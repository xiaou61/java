package 常见算法.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambda表示式2 {
    public static void main(String[] args) {
        Integer[]arr={1,3,4,6,8,4,2,4};
        //完整格式
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        //lambda改写
        Arrays.sort(arr,(Integer o1,Integer o2)->{
            return o1-o2;
        });

        //lambda省略的改写
        //因为类型一样，所以可以省略
        //如果表达式只有一行，大括号，分号，return可以省略不写，需要同时省略
        Arrays.sort(arr,(o1,o2)->o1 - o2);

    }
}
