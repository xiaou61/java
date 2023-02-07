package 异常;

public class a2 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        try {
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }
        System.out.println("我依旧会执行");
    }
}
