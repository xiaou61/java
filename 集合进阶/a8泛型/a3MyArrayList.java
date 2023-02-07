package 集合进阶.a8泛型;

import java.util.Arrays;

/*
如果不确定类型，这个类就可以定义成泛型类
 */
public class a3MyArrayList<E> {

    Object[] obj=new Object[10];
    int size;

    /*
    E:表示不确定的类型
     */
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
