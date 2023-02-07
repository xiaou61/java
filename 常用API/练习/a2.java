package 常用API.练习;

public class a2 {
    public static void main(String[] args) {
        //自己实现parseInt方法

        String str="123456789";
        //校验字符串
        //习惯：先把异常数据进行过滤
        if (!str.matches("[1-9]\\d{0,9}")){
            System.out.println("数据格式有误");
        }else {
            System.out.println("数据格式正确");
            //类型的转换
            //定义一个变量，表示最终的结果
            int number=0;

            //遍历字符串，得到里面的每一个字符
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';//这里的方法，是一个非常简单的方法，用了ASCII码表，0是48
                number = number * 10 + c;
            }
            System.out.println(number);
            System.out.println(number+1);






        }



    }
}
