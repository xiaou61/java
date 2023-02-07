package IO2;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class a4 {
    public static void main(String[] args) throws IOException {
/*        File src=new File("src/IO2/a.userinfo.txt");
        File dest=new File("src/IO2/copy.userinfo.txt");
        FileUtils.copyFile(src,dest);*/

        File src=new File("src/IO2/aaa");
        File dest = new File("src/IO2/BBB");
        FileUtils.copyDirectory(src, dest);

    }
}
