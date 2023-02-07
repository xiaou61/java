package 常用API;

public class a4 {
    public static void main(String[] args) {
        //0是正常停止
        //非0：告诉虚拟机当前是异常停止
//        System.exit(0);
        long l = System.currentTimeMillis();
        //从1970年1月1日0.00分到现在的时间。因为中国是东八区，所以对应的我们的时间是8.00
        System.out.println(l);
        //可以写程序的计算时间的计时器。


        //arraycopy
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int[]arr2=new int[arr.length];
        //参数1：数据源
        //参数2：从数据源数组中的第几个索引开始拷贝
        //参数3：目的地，要拷贝到那个数组当中
        //参数4：目的地数组的索引
        //参数5：拷贝的个数
        System.arraycopy(arr,0,arr2,0,10);


    }
}
