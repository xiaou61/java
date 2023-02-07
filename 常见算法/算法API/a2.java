package 常见算法.算法API;

import java.util.Arrays;
import java.util.Comparator;

/*
lambda表达式
 */
public class a2 {
    public static void main(String[] args) {
        Integer[]arr={1,2,4,6,13,567,2,3};
        Arrays.sort(arr,(Integer o1,Integer o2) -> {
            return o1-o2;
        });
    }
}
