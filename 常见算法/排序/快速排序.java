package 常见算法.排序;

import java.text.BreakIterator;

public class 快速排序 {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,4,2,70};
        quickSort(arr,0,arr.length-1);
        选择排序 x=new 选择排序();
        x.printArr(arr);
    }

    //一轮排序
    public static void quickSort(int[]arr,int i,int j){
        int start=i;
        int end=j;


        //递归的出口，start比end大
        if (start>end){
            return;
        }




        //记录基准数
        int baseNumber=arr[i];

        while (start!=end){

            while (true){
                if (end<=start || arr[end]<baseNumber){
                    break;
                }
                end--;
            }

            while (true){
                if (end<=start||arr[start]>baseNumber){
                    break;
                }
                start++;
            }

            //进行交换位置
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }

        //基准数归位。就是拿着这个范围中的第一个数字，和start中指向的元素进行交换

        int temp=arr[i];
        arr[i] = arr[start];//这里写end也可以
        arr[start] = temp;



        //进行递归
        //确定基准数左边的范围
        quickSort(arr, i,start-1);

        //确定基准数右边的范围
        quickSort(arr,start+1,j);


    }
}
