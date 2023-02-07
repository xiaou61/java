package File.综合练习;

import java.io.File;

public class a3 {
    public static void main(String[] args) {
        File file=new File("C:\\");
        /*
        套路：
        1.进入文件夹
        2.遍历数组
        3.判断
        4.判断
         */
        findAVI(file);
    }
    public static void findAVI(){
        File[] files = File.listRoots();
        for (File file : files) {
            findAVI(file);
        }
    }
    public static void findAVI(File src){
        File[] files = src.listFiles();
        if (files != null) {
            //2.遍历数组
            for (File file : files) {
                //判断如果是文件：可以执行逻辑
                //file表示每一个文件或者是文件夹
                if (file.isFile()){
                    String name = file.getName();
                    if (name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else {
                    //如果是文件夹：递归
                    //在调用本方法的时候，参数一定是src的次一级路径
                    findAVI(file);
                }
            }
        }

    }
}
