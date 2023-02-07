package 集合进阶.a11hash练习;

import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("张三",23);
        Student s2=new Student("李四",24);
        Student s3=new Student("王五",23);
        Student s4=new Student("张三",23);

        //创建集合用来添加学生
        HashSet<Student> hs=new HashSet<Student>();

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs.add(s4));//这里是false
        System.out.println(hs);
    }
}
