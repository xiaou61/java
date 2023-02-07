package File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class a2 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\Lenovo\\Desktop\\新建 文本文档.userinfo.txt");
        //是不是文件夹
        System.out.println(f1.isDirectory());
        //是不是文件
        System.out.println(f1.isFile());
        //路径是否存在
        System.out.println(f1.exists());
        //返回字节数
        //len/1024:KB
        //len/1024/1024:MB
        //如果我们要获取一个文件夹的大小，不能直接获取，需要把这个文件夹的所有文件的大小都加起来。
        System.out.println(f1.length());
        System.out.println("-------------------------------");
        //返回绝对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println("-------------------------------");
        //获取定义文件时，返回的文件。简单来说，在创建文件对象的时候，你括号里面写的什么。他就返回什么
        System.out.println(f1.getPath());
        System.out.println("-------------------------------");
        //获取名字
        //细节：如果是一个文件，那么返回的是文件名字+文件扩展名。如果是一个文件夹的话，返回的就是文件夹的名字
        System.out.println(f1.getName());
        System.out.println("-------------------------------");
        //返回文件的最后修改时间(时间毫秒值)
        long time = f1.lastModified();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(time));


    }
}
