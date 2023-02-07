package 常用API;

import java.io.IOException;
import java.sql.SQLOutput;

public class a5 {
    public static void main(String[] args) throws IOException {
        //获取runtime的对象
        Runtime r1 = Runtime.getRuntime();//规定了runtime只能有一个对象
        //停止虚拟机
        //r1.exit(0);
        //cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //虚拟机从系统中获得的总的内存大小，单位是byte字节
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        //已经获取的总内存的大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //运行cmd命令
        Runtime.getRuntime().exec("notepad");
    }
}
