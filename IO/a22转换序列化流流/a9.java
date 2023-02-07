package IO.a22转换序列化流流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class a9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/IO/a22转换序列化流流/student.userinfo.txt"));

        ArrayList<Students> list = (ArrayList<Students>) ois.readObject();

        for (Students students : list) {
            System.out.println(students);
        }
        ois.close();
    }
}
