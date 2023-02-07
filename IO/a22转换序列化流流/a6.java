package IO.a22转换序列化流流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class a6 {
    public static void main(String[] args) throws IOException {
        Student stu=new Student("zhangsan",60);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/IO/a22转换序列化流流/d.userinfo.txt"));

        oos.writeObject(stu);

        oos.close();
    }
}
