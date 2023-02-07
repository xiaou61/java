package 方法引用;


import java.util.Arrays;

public class a1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        //方法引用
        //a1::subtraction,表示引用a1里面的subtraction方法，把这个方法当做抽象方法的方法体
        Arrays.sort(arr,a1::subtraction);
        System.out.println(Arrays.toString(arr));

    }
    public static int subtraction(int num1,int num2){
        return num2-num1;
    }
}
