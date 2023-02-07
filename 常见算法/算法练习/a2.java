package 常见算法.算法练习;

public class a2 {
    private static int count=0;
    public static void main(String[] args) {
        //从第三个数据开始，是前两个数据的和。叫做斐波那契数列
        //递归思想
        System.out.println(getSum(18));
        System.out.println(count);
    }
    public static int getSum(int month){
        if (month==1||month == 2){
            return 1;
        }
        count++;
        return getSum(month-1)+getSum(month-2);
    }
}
