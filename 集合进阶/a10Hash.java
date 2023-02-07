package 集合进阶;


public class a10Hash {
    public static void main(String[] args) {
        a10Student a=new a10Student("你好",12);
        System.out.println(a.hashCode());
        a10Student b=new a10Student("你好",12);
        System.out.println(b.hashCode());
    }
}
