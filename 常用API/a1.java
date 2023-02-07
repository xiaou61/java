package 常用API;

import java.awt.image.Kernel;
import java.util.Arrays;

public class a1 {
    public static void main(String[] args) {
        //abs表示绝对值
        System.out.println(Math.abs(88));
        //但是abs的取值是-2147483648~2147483647
        //如果在这个区间没有相应的值与之对应的话
        //所产生的abs值就会产生bug只有一个特例：-2147483648
        System.out.println(Math.abs(-2147483648));

        //所以在jdk15之后，我们就有了这个absExact方法，有了这个方法就可以写所有的数字了。
        System.out.println(Math.absExact(151));

        //进一法，往数轴的正方向进一。
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(-12.54));

        //去尾法,往数轴的反方向
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-12.34));
        System.out.println(Math.floor(-12.54));


        //四舍五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));

        //获得两个数字的较大值
        System.out.println(Math.max(20, 30));
        //获取两个数字较小值
        System.out.println(Math.min(20, 30));

        //获取a的b次幂
        System.out.println(Math.pow(2, 3));
        //细节：如果第二个参数写的是0~1之间的小数，那么就是开根号了
        //开根号
        Math.sqrt(4);
        //开立方
        Math.cbrt(8);
        //随机数。0~1.0的小数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }


    }
}
