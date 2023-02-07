package File;

import java.io.File;

public class a4 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\Lenovo\\Desktop\\java文件新建.userinfo.txt");
        //直接删除不经过回收站
        boolean b = f1.delete();
        System.out.println(b);
        //如果要是删除文件夹的话，如果文件夹里面还有文件，就无法删除，但是如果没有文件，就可以直接删除
        File f2=new File("C:\\Users\\Lenovo\\Desktop\\java创建的文件夹");
        boolean delete = f2.delete();
        System.out.println(delete);
    }
}
