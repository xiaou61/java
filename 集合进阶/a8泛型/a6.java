package 集合进阶.a8泛型;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
定义一个方法：形参是一个集合，但集合中的数据类型不确定
 */
public class a6 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<Ye>();
        ArrayList<Fu> list2 = new ArrayList<Fu>();
        ArrayList<Zi> list3 = new ArrayList<Zi>();
        ArrayList<student> list4 = new ArrayList<student>();

        method(list1);
        method(list2);
        method(list3);

    }

    /*
    弊端：利用泛型方法有一个小弊端，此时他可以接受任意的数据类型
    希望：本方法，虽然不确定类型，但是只希望Ye Fu Zi
    此时我们就可以使用泛型的通配符
    ？也表示不确定的类型
    但是她可以进行类型的限定
    ？extends E 可以传递e或者e所有的子类类型
    ？super E 可以传递e或者e的所有父类类型


     */
    public static void method(ArrayList<? extends Ye> list) {

    }
}

class Ye {
}

class Fu extends Ye {
}

class Zi extends Fu {
}

class student {

}