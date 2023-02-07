package File.综合练习;

import java.io.File;

public class a4 {
    public static void main(String[] args) {
        /*
        如果我们要删除一个有内容的文件夹
        1.先删除文件夹里面所有的内容
        2.在删除自己
         */
        File file=new File("C:\\Users\\Lenovo\\Desktop\\java创建的多级文件夹");
        delete(file);
    }
    /*
    作用：删除src文件夹
    参数：要删除的文件夹
     */
    public static void delete(File src){
        //进入src
        File[] files = src.listFiles();

        //遍历
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                delete(file);
            }
        }
        src.delete();
    }
}
