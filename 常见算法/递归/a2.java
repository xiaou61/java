package 常见算法.递归;

public class a2 {
    public static void main(String[] args) {
        int result = getFactorialRecursion(5);
        System.out.println(result);
    }
    public static int getFactorialRecursion(int number){
        if (number==1){
            return 1;
        }
        return number*getFactorialRecursion(number-1);
    }
}
