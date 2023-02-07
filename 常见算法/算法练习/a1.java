package 常见算法.算法练习;

import java.util.Arrays;

public class a1 {
    public static void main(String[] args) {
        a1javabean gf1=new a1javabean("小1",18,167);
        a1javabean gf2=new a1javabean("小2",14,187);
        a1javabean gf3=new a1javabean("小3",15,177);
        //定义数组存储信息
        a1javabean[] arr={gf1,gf2,gf3};

        //排序
        Arrays.sort(arr,((o1, o2) -> {
            double temp=o1.getAge()-o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp==0?o1.getName().compareTo(o2.getName()):temp;

            if (temp>0){
                return 1;
            }else if (temp<0){
                return -1;
            }else {
                return 0;
            }
        }));
        System.out.println(Arrays.toString(arr));
    }
}
