package 集合进阶.a8泛型;

public class a3Test {
    public static void main(String[] args) {
        a3MyArrayList<String> list=new a3MyArrayList<>();
        list.add("123");
        list.add("345");
        String s = list.get(1);
        System.out.println(s);
        String s1 = list.toString();
        System.out.println(s1);

    }
}
