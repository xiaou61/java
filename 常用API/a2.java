package 常用API;

public class a2 {
    public static void main(String[] args) {
        //判断一个数是否是质数,进阶版
        System.out.println(isPrime(13));
        System.out.println(isPrime(10));
    }
    public static boolean isPrime(int Number){
        for (int i=2;i<=Math.sqrt(Number);i++){
            if (Number % i==0){
                return false;
            }
        }
        return true;
    }
}
