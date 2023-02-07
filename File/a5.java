package File;

import java.io.File;

public class a5 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Lenovo\\Desktop");
        //遍历
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
