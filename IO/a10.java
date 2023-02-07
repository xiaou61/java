package IO;

import java.io.*;

public class a10 {
    public static void main(String[] args) throws IOException {
        File src=new File("src/IO/file");

        File copy=new File("src/IO/copy");

        copydir(src,copy);
    }
/*
作用：拷贝文件夹
参数一：拷贝源
参数二：拷贝的目的地
 */
    private static void copydir(File src, File copy) throws IOException {
        //如果不存在那就创建出来
        copy.mkdir();
        //递归
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                //拷贝的时候从文件开始，也要从文件结束。所以这个fileoutputstream的写法如下
                FileInputStream fis=new FileInputStream(file);
                FileOutputStream fos=new FileOutputStream(new File(copy,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else {
                copydir(file,new File(copy,file.getName()));
            }
        }


    }
}
