package File.综合练习;

import java.io.File;

public class a5 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Lenovo\\Desktop");
        long len = getLen(file);
        long gb = len / 1024 / 1024 / 1024;
        System.out.println(gb);


    }
    /*
    作用：统计一个文件夹的总大小
    参数：表示要统计的那个文件
    返回值：统计后的结果
     */
    public static long getLen(File src){
        //定义变量
        long len=0;

        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                len += file.length();
            }else {
                len=len+getLen(file);
            }
        }
        return len;
    }
}
