package File.综合练习;

import java.io.File;
import java.io.IOException;

public class a1 {
    public static void main(String[] args) throws IOException {
        File file=new File("untitled\\aaa");
        //创建父级路径
        file.mkdirs();

        //拼接父级和子级路径
        File src=new File(file,"a.userinfo.txt");

        boolean n = src.createNewFile();
        if (n){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }

    }
}
