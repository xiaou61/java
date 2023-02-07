package 常用API;

public class a24 {
    public static void main(String[] args) {
        //利用构造方法，jdk5以前的
        Integer i1=new Integer(1);
        Integer i2=new Integer(2);

        //利用静态方法
        Integer i3=Integer.valueOf("3");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);


        Integer i4=Integer.valueOf(127);
        Integer i5=Integer.valueOf(127);
        System.out.println(i4==i5);//结果是true

        Integer i6=Integer.valueOf(128);
        Integer i7=Integer.valueOf(128);
        System.out.println(i6==i7);//结果是false


        Integer i8=new Integer(127);
        Integer i9=new Integer(127);
        System.out.println(i8==i9); //false



        Integer i10=new Integer(128);
        Integer i11=new Integer(128);
        System.out.println(i10==i11);//false

    }
}
