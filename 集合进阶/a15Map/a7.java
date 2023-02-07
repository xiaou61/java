package 集合进阶.a15Map;

import java.util.TreeMap;

public class a7 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm=new TreeMap<Student, String>();

        Student s1=new Student("zhangsan",20);
        Student s2=new Student("lisi",12);
        Student s3=new Student("wangwu",45);

        tm.put(s1,"天津");
        tm.put(s2,"北京");
        tm.put(s3,"济南");

        System.out.println(tm);
    }
}
