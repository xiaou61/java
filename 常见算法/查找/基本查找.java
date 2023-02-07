package 常见算法.查找;

public class 基本查找 {
    public static void main(String[] args) {
        //基本查找，也叫顺序查找，从0索引开始往后依次查找
        //需要定义一个方法，利用基本查找，查询某个元素是否存在
        int[] arr={131,125,135,50,26,80,66};

        int number=81;

        boolean result = basicSearch(arr, number);

        System.out.println(result);

    }
    public static boolean basicSearch(int[] arr,int number){

        //基本基本查找，查找number是否在arr里存在

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
