package 常见算法.排序;

public class 插入排序 {
    public static void main(String[] args) {
        int[] arr={13,44,56,13,144,53,63,74};
        //找到无序的是从哪一个索引开始的
        int startIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]){
                startIndex=i+1;
                break;
            }
        }
        //从startIndex索引开始，遍历后面的所有索引
        for (int i = startIndex; i < arr.length; i++) {
            //记录当前要插入的数据的索引
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        冒泡排序 mp=new 冒泡排序();
        mp.printArr(arr);
    }
}
