package File.综合练习;

import java.io.File;

public class a2 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Lenovo\\Desktop");
        boolean b = haveAVI(f);
        System.out.println(b);
    }
    /*
    作用：用来找某个文件夹中，是否有avi结尾的电影
     */
    public static boolean haveAVI(File file){
        //记录
        File[] files = file.listFiles();
        for (File f : files) {
            //f表示每一个文件或者是文件夹的路径
            if (f.isFile()&&f.getName().endsWith(".avi")){
                return true;
            }
        }
        //如果还没有找到，直接返回false
        return false;
    }
}
