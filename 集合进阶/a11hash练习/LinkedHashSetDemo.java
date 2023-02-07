package 集合进阶.a11hash练习;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Student s1=new Student("张三",23);
        Student s2=new Student("李四",23);
        Student s3=new Student("张三",23);
        LinkedHashSet<Student> lhs=new LinkedHashSet<Student>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        System.out.println(lhs);//此时这里就是有序的
    }

}
