package 集合进阶.a8泛型;
/*
实现类给出具体的类型
 */
public class a5 {
    public static void main(String[] args) {
        MyArrList2 my=new MyArrList2();
        boolean add = my.add("123");
        MyArrList3<Integer> a=new MyArrList3<Integer>();
        a.add(8);
    }

}
