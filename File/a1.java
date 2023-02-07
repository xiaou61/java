package File;

import java.io.File;

public class a1 {
    public static void main(String[] args) {
        String str="C:\\Users\\Lenovo\\Desktop";
        //变成一个文件对象
        File f1=new File(str);
        System.out.println(f1);
    }
}
