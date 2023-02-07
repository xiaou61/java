package IO2;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class a3 {
    public static void main(String[] args) throws IOException {
        File src = new File("src/IO2/aaa");

        File destParent=src.getParentFile();


        File dest=new File(destParent,src.getName()+".zip");

        //创建压缩流
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest));

        toZip(src,zos,src.getName());

        zos.close();
    }
/*
作用：获得src里面的每一个文件，变成zipEntry对象，放入压缩包当中
参数一：数据源

参数二：压缩流
参数三：压缩包内部的路径
 */
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        File[] files=src.listFiles();

        for (File file : files) {
            if (file.isFile()){
                ZipEntry entry=new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(entry);

                FileInputStream fis=new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else {
                toZip(file,zos,name + "\\"+file.getName());
            }
        }
    }

}
