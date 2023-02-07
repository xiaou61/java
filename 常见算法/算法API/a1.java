package 常见算法.算法API;

import java.util.Arrays;
import java.util.Comparator;

public class a1 {
    public static void main(String[] args) {
        System.out.println("tostring");
        int[]arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        System.out.println("binarySearch");
        //数组的元素必须有序且必须是升序的
        System.out.println(Arrays.binarySearch(arr, 5));
        //如果要查找的要素存在，返回的是真实索引
        //不存在就是插    入点-1

        //拷贝数组
        System.out.println("copyOf");
        int[] newArr=Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr));

        //拷贝数组指定范围
        System.out.println("copyOfRange");
        int[] newArr1=Arrays.copyOfRange(arr,1,3);//包头不包尾
        System.out.println(Arrays.toString(newArr1));

        //填充数组
        System.out.println("fill");
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));

        //排序
        int[] arr2={2,31,4,1,5,6,7};
        Arrays.sort(arr2);//默认升序
        System.out.println(Arrays.toString(arr2));

        //降序：
        //底层原理：插入排序+二分查找的方式进行排序的。

        Integer arr3[]= {1, 3, 4, 56, 7, 8, 9};
        //compare方法o1：表示在无序序列中，遍历得到的每一个元素
        //o2:有序序列的元素
        //返回值：负数：表示当前要插入的数据是小的，放到前面
        //正数：表示当前要插入的数据是大的，放到后面。
        //0：表示是一样的，也会放到后面。

        //简单理解：o1-o2是升序排列
        //o2-o1是降序排列
        Arrays.sort(arr3,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
