package 集合进阶.a13;

import java.util.TreeSet;

public class a13TreeSetdemo2 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);

        TreeSet<Student> ts=new TreeSet<Student>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
    }
}
