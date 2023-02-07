package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class a5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,"aaa","bbb");
        list.stream()
                .map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
