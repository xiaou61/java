package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class a4lambda遍历 {
    public static void main(String[] args) {
        Collection <String> coll=new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        coll.add("c");

       coll.forEach(s -> System.out.println(s));


    }
}
