package 常见算法.递归;

public class a1 {
    public static void main(String[] args) {
        int result = getSum(100);
        System.out.println(result);
    }
    public static int getSum(int number){
        if (number==1){
            return 1;
        }
        return number+getSum(number-1);
    }
}
