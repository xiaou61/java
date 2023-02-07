package 集合进阶.a14;

import java.util.TreeSet;
import java.util.zip.DeflaterOutputStream;

public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student2 s1=new Student2("zhangsan",20,60,50,90);
        Student2 s2=new Student2("xiaobai",22,20,50,90);
        Student2 s3=new Student2("xiaohei",23,50,50,100);
        Student2 s4=new Student2("xiaosha",26,70,30,100);
        Student2 s5=new Student2("xiaoshazi",22,90,90,80);

        //创建集合对象
        TreeSet<Student2> ts=new TreeSet<Student2>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //直接打印集合会报错，指定规则
        for (Student2 t : ts) {
            System.out.println(t);
        }

    }
}
