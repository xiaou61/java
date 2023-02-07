package 常见算法.查找;

public class 二分查找 {
    public static void main(String[] args) {
        int[] arr={7,11,12,14,15};
        System.out.println(binarySearch(arr, 8));
    }
    public static int binarySearch(int[] arr,int number){
        //定义俩个变量
        int min=0;
        int max=arr.length-1;
        while (true){
            if (min > max){
                return - 1;
            }
            //寻找数据
            //找到min和max的中间位置
            int mid=(min + max)/2;

            //有三种情况：
            if (arr[mid]>number) {
                max=mid-1;
            }else if (arr[mid]<number){
                min=mid+1;
            }else {
                return mid;
            }

        }

    }
}
