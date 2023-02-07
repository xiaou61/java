package 常见算法.算法练习;

public class a3 {
    public static void main(String[] args) {
        System.out.println(getCount(1));
    }
    public static int getCount(int day){
        if (day<=0||day>=11){
            System.out.println("当前时间错误");
            return -1;
        }

        //递归的出口
        if (day==10){
            return 1;
        }
        return (getCount(day+1)+1)*2;
    }
}
