package 常用API.a13正则表达式;

public class a2 {
    public static void main(String[] args) {
        //正则表达式的书写
        String qq="123456780";
        //传递一个正则表达式
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }
}
