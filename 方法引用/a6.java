package 方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class a6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Collections.addAll(list,1,2,3,4,5,6,7);

        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
