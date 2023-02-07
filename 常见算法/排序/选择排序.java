package 常见算法.排序;

public class 选择排序 {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        for (int i = 0; i < arr.length-1; i++) {
            //拿着0索引和后面的比较
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
