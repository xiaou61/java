package 集合进阶.a8泛型;

import java.util.ArrayList;

public class a2有泛型的情况 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("123");
        list.add("314");
        list.forEach(s -> System.out.println(s));
    }
}
