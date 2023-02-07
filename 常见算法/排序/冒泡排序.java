package 常见算法.排序;

public class 冒泡排序 {
    public static void main(String[] args) {
        int []arr={2,3,5,4,1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
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
