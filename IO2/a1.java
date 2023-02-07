package IO2;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class a1 {
    public static void main(String[] args) throws IOException {
        //创建一个file
        File src=new File("src/IO2/zip.zip");
        File dest=new File("src/IO2");
        unzip(src,dest);
    }
    //定义一个方法用来解压
    public static void unzip(File src,File dest) throws IOException {
        //本质：把压缩包里面每一个文件或者文件夹读取出来，按照层级读取
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);

            //如果是文件夹，就要在目的地创建一个同样的文件夹
            //如果是文件，需要读取压缩包中的文件，并把她放到目的地dest文件夹中。

            //判断是否为文件夹
            if (entry.isDirectory()){
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else {
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    //写到目的地
                    fos.write(b);

                }
                fos.close();
                //表示在压缩包中一个文件处理完毕
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
