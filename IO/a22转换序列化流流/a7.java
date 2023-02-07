package IO.a22转换序列化流流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class a7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/IO/a22转换序列化流流/d.userinfo.txt"));
        Student o = (Student) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
