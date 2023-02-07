package File;

import java.io.File;
import java.io.IOException;

public class a3 {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\Users\\Lenovo\\Desktop\\java文件新建.userinfo.txt");
        //创建返回值是是否创建成功
        //如果路径不存在，方法会有异常
        //此方法创建的一定是文件，如果没有后缀名，那么就会创建一个没有后缀名的文件，而不是创建一个文件夹。
        boolean b = f1.createNewFile();
        System.out.println(b);

        //创建单级文件夹：
        File f2=new File("C:\\Users\\Lenovo\\Desktop\\java创建的文件夹");
        boolean c = f2.mkdir();
        System.out.println(c);

        //创建多级文件夹：
        File f3=new File("C:\\Users\\Lenovo\\Desktop\\java创建的多级文件夹\\aaa\\bbb");
        boolean e = f3.mkdirs();
        System.out.println(e);

        //综上所述，我们以后创建文件夹，都可以直接使用mkdirs。因为mkdirs也可以创建单级文件夹。
    }
}
