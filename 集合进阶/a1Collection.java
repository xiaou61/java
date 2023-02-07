package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;

public class a1Collection {
    public static void main(String[] args) {
        //她是一个接口，我们不能直接创建她的对象，只能创建她的实现类的对象
        //实现类：arraylist
        //目的：为了学习collection接口里面的方法
        //以后在创建的时候，还是用之前的方法去创建。
        Collection<String> coll=new ArrayList<>();

        //如果我们添加数据，如果往List系列的集合添加，方法永远返回true
        //如果要往set系列的集合添加，如果当前要添加的元素已经存在，那此时方法会返回false，表示添加失败。
        coll.add("a");
        System.out.println(coll);

        coll.clear();
        System.out.println(coll);

        coll.add("a");
        coll.add("b");
        //因为collection定义的是共性的方法，所以不能通过索引删除
        //删除成功返回true，删除失败返回false
        coll.remove("a");
        System.out.println(coll);


        //判断元素是否包含
        //底层是依靠equals方法，进行判断是否存在。
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javabean类
        //当中，一定要重写equals方法！
        boolean result = coll.contains("a");
        boolean b = coll.contains("b");
        System.out.println(result);
        System.out.println(b);

        //是否为空
        boolean empty = coll.isEmpty();
        System.out.println(empty);

        //判断长度
        int size = coll.size();
        System.out.println(size);
    }
}
