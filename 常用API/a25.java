package 常用API;

public class a25 {
    public static void main(String[] args) {
        //1.把整数转换成二进制
        String s = Integer.toBinaryString(100);
        System.out.println(s);

        //八进制
        String s1 = Integer.toOctalString(100);
        System.out.println(s1);

        //十六进制
        String s2 = Integer.toHexString(100);
        System.out.println(s2);


        //4.非常重要，经常会用到，java是强数据类型。在计算的时候，如果不是同一个数据类型，是无法计算的。
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i+1);

        //细节1：在类型转换的时候，括号中的参数只能是数字，不能是其他，否则代码会报错
        //八中包装类中，除了character都有对应的parsexxx的转换方法



    }
}
