package 常用API.练习;

public class a3 {
    public static void main(String[] args) {
        String s = toBinaryString(123);
        String s1 = Integer.toBinaryString(123);
        System.out.println(s);
        System.out.println(s1);
    }

    public static String toBinaryString(int number){


        StringBuilder sb=new StringBuilder();
        //不断的去除于二
        while (true){
            if (number == 0) {
                break;
            }
            //获取余数
            int remaindar = number % 2;

            number=number/2;

            //倒着拼接

            sb.insert(0,remaindar);

        }
        return sb.toString();
    }
}
