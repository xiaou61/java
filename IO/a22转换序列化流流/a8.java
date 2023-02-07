package IO.a22转换序列化流流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class a8 {
    public static void main(String[] args) throws IOException {
        Students s1=new Students("zhangsan",23,"南京");
        Students s2=new Students("lisi",21,"北京");
        Students s3=new Students("wangwu",33,"上海");

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/IO/a22转换序列化流流/student.userinfo.txt"));
        ArrayList<Students> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();
    }
}
