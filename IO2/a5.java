package IO2;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class a5 {
    public static void main(String[] args) {
        File file = FileUtil.file("E:\\untitled\\out\\production\\untitled\\src\\IO2\\ddd\\a.userinfo.txt");
        //根据参数创建文件。
        File touch = FileUtil.touch(file);
        System.out.println(touch);

    }
}
